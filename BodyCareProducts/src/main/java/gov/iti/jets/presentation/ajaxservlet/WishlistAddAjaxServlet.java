package gov.iti.jets.presentation.ajaxservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;


public class WishlistAddAjaxServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       
        Product product;
        int id = Integer.parseInt(request.getParameter("productId"));
       
        HttpSession session= request.getSession(true);
        List<Product> productsList = (List<Product>)session.getAttribute("wishlist");

        if(productsList != null){
            Optional<Product> productOptional = productsList.stream().filter( p -> p.getId()==id).findFirst();
            if(productOptional.isEmpty()){
                product = DomainFacade.getProduct(id);
                productsList.add(product);
            }
           
        }else{
            productsList = new ArrayList<>();
            product = DomainFacade.getProduct(id);
            productsList.add(product);
        }

        session.setAttribute("wishlist", productsList);
        session.setAttribute("wishlistsize", productsList.size()+"");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write(productsList.size()+"");
        
    }
}