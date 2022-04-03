package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ProductDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.UserDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class RegisterUserControllerServlet extends HttpServlet {

   private static final RequestMapper<User> userMapper= new UserDtoMapper();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session!=null){
            if ((String) session.getAttribute("AuthToken") == null){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
                requestDispatcher.forward(request, response);
            }else{
                response.sendRedirect("index.jsp");
            }
        }else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
            requestDispatcher.forward(request, response);
        }

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user=userMapper.map(request);
        System.out.println("user="+user);
        boolean  isUserInserted= DomainFacade.addUser(user);

        if (isUserInserted){

            System.out.println("doneeeee");

            response.sendRedirect("index.jsp");
        }else {
            System.out.println("errorrrrrr");
        }
    }

}