package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.List;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductLoadControllerServlet extends HttpServlet {  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String category = request.getParameter("category");
        if(category==null){
            List<Product> products1 = DomainFacade.loadAllProducts();   
            request.setAttribute("products", products1);
            
        }
        else{
            System.out.println("EL STRING AHWHAAAA " + category);
            List<Product> products2 = DomainFacade.loadProductsByCategory(category);   
            request.setAttribute("products", products2);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("shop.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

}