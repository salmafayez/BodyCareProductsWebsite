package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddProductToCartServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        String product = request.getParameter("productid");
        String action = request.getParameter("action");
        Boolean found = false;

        Integer productId = Integer.valueOf(product);
        Product product1 = DomainFacade.getProductById(productId);

        System.out.println("Herrrrrrrrrrrrrrrrrrrrrrrrrrrrrr" + action + product);
        if (action.equals("addplus")) {
            System.out.println("addplus");
            if (session.getAttribute("cart") == null) {
                List<CartItemDto> cart = new ArrayList<>();
                cart.add(new CartItemDto(product1, 1));
                session.setAttribute("cart", cart);
            } else {
                List<CartItemDto> cart = (List<CartItemDto>) session.getAttribute("cart");
                for (CartItemDto cartItemDto : cart) {
                    if (cartItemDto.getProduct().getId() == productId) {
                        int quantity = cartItemDto.getQuantity();
                        cartItemDto.setQuantity(++quantity);
                        found = true;
                    }
                }
                if (!found) {
                    cart.add(new CartItemDto(product1, 1));
                }
                session.setAttribute("cart", cart);
            }
            found = false;

        }

        if (action.equals("addminus")) {
            System.out.println("addminus");
            if (session.getAttribute("cart") == null) {

            } else {
                List<CartItemDto> cart = (List<CartItemDto>) session.getAttribute("cart");
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

        }
        if (action.equals("delete")) {
            System.out.println("delete");
            List<CartItemDto> cart = (List<CartItemDto>) session.getAttribute("cart");
            for (CartItemDto cartItemDto : cart) {
                if (cartItemDto.getProduct().getId() == productId) {
                    cart.remove(cartItemDto);
                }
            }
        }

        for (CartItemDto cartItemDto : (List<CartItemDto>) session.getAttribute("cart")) {
            System.out.println("productName: " + cartItemDto.getProduct().getImage());
            System.out.println(
                    "cart " + cartItemDto.getQuantity() + "productName: " + cartItemDto.getProduct().getName());
        }
        System.out.println("product " + product1.getName());

    }
}
