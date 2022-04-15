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

public class DecrementProductQuantityCartAjaxServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("here");
        HttpSession session = request.getSession(false);
        int productId = Integer.parseInt(request.getParameter("productId"));

        Boolean found = false;
        List<CartItemDto> cart;

        Product product1 = DomainFacade.getProductById(productId);

            if (session.getAttribute("cart") == null) {
                cart = new ArrayList<>();
                cart.add(new CartItemDto(product1, 1));
                session.setAttribute("cart", cart);
            } else {
                cart = (List<CartItemDto>) session.getAttribute("cart");
                for (CartItemDto cartItemDto : cart) {
                    if (cartItemDto.getProduct().getId() == productId) {
                        int quantity = cartItemDto.getQuantity();
                        cartItemDto.setQuantity(--quantity);
                        found = true;
                    }
                }
                if (!found) {
                    cart.add(new CartItemDto(product1, 1));
                }
                session.setAttribute("cart", cart);
            }
            found = false;

            int cartLength = 0;
        for (CartItemDto cartItemDto : (List<CartItemDto>) session.getAttribute("cart")) {
            cartLength += cartItemDto.getQuantity();
        }
        System.out.println("product " + product1.getName());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write(cartLength+"");
    }
}
