package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WishlistControllerServlet extends HttpServlet {
   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // HttpSession session= request.getSession(true);
        // List<Product> productsList = (List<Product>)session.getAttribute("wishlist-product-list");
        // System.out.println(productsList.size());
        // if(productsList != null){
        //     request.setAttribute("wishlist-product-list", productsList);
        // }
        request.getRequestDispatcher("wishlist.jsp").forward(request, response);
    }
}
