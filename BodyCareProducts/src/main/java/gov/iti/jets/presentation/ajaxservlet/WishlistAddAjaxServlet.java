package gov.iti.jets.presentation.ajaxservlet;


import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.dtos.CategoryDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WishlistAddAjaxServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getParameter("productId"));
      /*  int id = Integer.parseInt(request.getParameter("productId"));
        //System.out.println(id);
        Product product = DomainFacade.getProduct(id);
        HttpSession session= request.getSession(false);
        List<Product> productsList = (List<Product>)session.getAttribute("wishlist-product-list");
        if(productsList == null){
            productsList = new ArrayList<>();
        }
        productsList.add(product);
        session.setAttribute("wishlist-product-list", product);
        //productsList.forEach(System.out::println);
        //System.out.println(productsList.size());*/
        PrintWriter out = response.getWriter();
        out.write("7");
        
    }
}