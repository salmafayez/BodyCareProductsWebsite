package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddProductControllerServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("add-product.jsp");
        requestDispatcher.include(request, response);

    }    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        //request.getParameter(productName)
    }  
}
