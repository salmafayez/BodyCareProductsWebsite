package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.UUID;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.util.HashManager;
import gov.iti.jets.presentation.util.InputValidation;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.persistence.NoResultException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginControllerServlet extends HttpServlet{

    private InputValidation validator = InputValidation.getInstance();;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      
        HttpSession session = request.getSession(false);
        if(session!=null){
            if ((String) session.getAttribute("AuthToken") == null){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
                requestDispatcher.forward(request, response);
            }else{
                response.sendRedirect("index.jsp");
            }
        }else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
        }
       
    }    

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if(!validator.EmailValidation(email)){
            request.setAttribute("error", "Wrong email format");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
            return;
        }
       
        try{
            User user = DomainFacade.login(email);
            String userPassword = HashManager.INSTANCE.generateSecurePassword(password);
            System.out.println(userPassword);
            if(userPassword.equals(user.getPassword())){
                if(request.getParameter("remember")!=null){
                    UUID uuid = UUID.randomUUID();
                    String randomUUIDString = uuid.toString();
                    request.getSession().setAttribute("AuthToken", randomUUIDString);
                    request.getSession().setAttribute("userId", user.getId());
                    request.getSession().setAttribute("userName", user.getUserName());

                    // now create a new cookie with this UUID value
                    Cookie newCookie = new Cookie("AuthToken", randomUUIDString);
                    response.addCookie(newCookie);
                }
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("shop.jsp");
                requestDispatcher.forward(request, response);
            }
            else{
                request.setAttribute("error", "Wrong email or passsword");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
                requestDispatcher.forward(request, response);
            }
           
        }catch (NoResultException e){
            request.setAttribute("error", "Wrong email or passsword");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
            requestDispatcher.forward(request, response);
        }  
    }
}
    
