package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class PageNotFoundServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("page-not-found.jsp");
       requestDispatcher.forward(request, response);
    }   
     
}
