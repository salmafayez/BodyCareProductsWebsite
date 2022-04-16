package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.UUID;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.entities.UserType;
import gov.iti.jets.presentation.util.CookieHandler;
import gov.iti.jets.presentation.util.HashManager;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.persistence.NoResultException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginControllerServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession(false);
        if(session != null){
            if ((String) session.getAttribute("AuthToken") == null){
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }else{
                response.sendRedirect("home");
            }
        }else{
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
       
    }    

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
       
        try{
            User user = DomainFacade.login(email);
            String hashedPassword = HashManager.INSTANCE.generateSecurePassword(password);

            if(hashedPassword.equals(user.getPassword())){

                HttpSession session = request.getSession(true);
                UUID uuid = UUID.randomUUID();
                String randomUUIDString = uuid.toString();
                session.setAttribute("AuthToken", randomUUIDString);
                CookieHandler.addCookie("AuthToken", randomUUIDString, 60*60*24*365, response);
                session.setAttribute("userId", user.getId());
                session.setAttribute("userName", user.getUserName());

                if(request.getParameter("remember")!=null){
                    session.setAttribute("rememberme", "true");
                }
                
                if(user.getUserType() == UserType.CLIENT){
                    response.sendRedirect("products");
                }else{
                    session.setAttribute("isAdmin", "true");
                    response.sendRedirect("admin-dashboard.jsp");
                }  
            }
            else{
                request.setAttribute("errorMessage", "Wrong email or password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
           
        }catch (NoResultException e){
            request.setAttribute("errorMessage", "This account is not exist");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }  
    }
}
    
