package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.requestdtomappers.ProductDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterUserControllerServlet extends HttpServlet {
//    private static final RequestMapper<User> userMapper= new ProductDtoMapper();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(request, response);

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email");
        boolean result = DomainFacade.checkEmail(email);

        if (result){
            // add el user
            System.out.println("doneeeee");
            //RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            response.sendRedirect("index.jsp");
        }else {
            System.out.println("errorrrrrr");
        }
    }

}