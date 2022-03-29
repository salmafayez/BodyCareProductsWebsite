package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class AddProductControllerServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("add-product.jsp");
        requestDispatcher.include(request, response);

    }    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Product product = new Product();
        product.setName(request.getParameter("productName"));
        product.setPrice(Double.parseDouble(request.getParameter("price")));
        product.setDescription(request.getParameter("description"));
        product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        // Part part = request.getPart("productImage");
        // product.setImage(part.getSubmittedFileName());
        DomainFacade.addProduct(product);

    }  
}
