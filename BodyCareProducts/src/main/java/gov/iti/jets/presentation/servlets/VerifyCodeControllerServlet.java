package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.UserDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class VerifyCodeControllerServlet extends HttpServlet {

    private static final RequestMapper<User> userMapper= new UserDtoMapper();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            boolean  isUserInserted = false;

            HttpSession session = request.getSession();
            String code= (String) session.getAttribute("authcode");
            String usercode = request.getParameter("authcode");

            User user = (User) session.getAttribute("user");

            if(usercode.equals(code)){

                isUserInserted = DomainFacade.addUser(user);
            }else{
                request.setAttribute("error", "Wrong Code");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("verify.jsp");
                requestDispatcher.forward(request, response);
            }

            if (isUserInserted){
                response.sendRedirect("login");
            }else {
                request.setAttribute("error", "cannot insert user");
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("verify.jsp");
                requestDispatcher.forward(request, response);
            }

        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("verify");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}