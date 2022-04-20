package gov.iti.jets.presentation.servlets;


import java.io.IOException;
import java.util.List;

import org.hibernate.validator.internal.util.DomainNameUtil;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminRemoveProductControllerServlet extends HttpServlet {  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int productId;
        if(request.getParameter("id")!=null){
            productId=Integer.parseInt(request.getParameter("id"));
            boolean remove = DomainFacade.removeProduct(productId);
           
        if(remove){
             RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminproducts");
        requestDispatcher.forward(request, response);
        }
    }

       
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

}