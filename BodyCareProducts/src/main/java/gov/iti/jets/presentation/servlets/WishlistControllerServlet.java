package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.List;

import gov.iti.jets.persistence.entities.Product;
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

public class WishlistControllerServlet extends HttpServlet {
   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // HttpSession session= request.getSession(true);
        // List<Product> productsList = (List<Product>)session.getAttribute("wishlist-product-list");
        // System.out.println(productsList.size());
        // if(productsList != null){
        //     request.setAttribute("wishlist-product-list", productsList);
        // }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("wishlist.jsp");
        requestDispatcher.forward(request, response);
    }
}
