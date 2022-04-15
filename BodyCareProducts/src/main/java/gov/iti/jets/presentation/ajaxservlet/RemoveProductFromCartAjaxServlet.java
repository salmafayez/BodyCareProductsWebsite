package gov.iti.jets.presentation.ajaxservlet;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.dtos.CartItemDto;
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

public class RemoveProductFromCartAjaxServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        int productId = Integer.parseInt(request.getParameter("productId"));
        List<CartItemDto> cart;


            if (session.getAttribute("cart") == null) {
                System.out.println("empty cart");
            } else {
                cart = (List<CartItemDto>) session.getAttribute("cart");
                for (CartItemDto cartItemDto : cart) {
                    if (cartItemDto.getProduct().getId() == productId) {
                        cart.remove(cartItemDto);
                    }
                }
                session.setAttribute("cart", cart);
            }

        int cartLength = 0;
        for (CartItemDto cartItemDto : (List<CartItemDto>) session.getAttribute("cart")) {
            cartLength += cartItemDto.getQuantity();
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write(cartLength+"");
    }
}
