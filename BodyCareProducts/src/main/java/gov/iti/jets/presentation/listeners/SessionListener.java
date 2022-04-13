package gov.iti.jets.presentation.listeners;

import java.util.List;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println("session created");
    }

    public void sessionDestroyed(HttpSessionEvent hse) {

        ServletContext context = hse.getSession().getServletContext();
        int x = (int) context.getAttribute("userId");
        User user = DomainFacade.getUser(x);
        if (hse.getSession().getAttribute("cart") == null) {
            System.out.println("Empty Cart Session");
        } else {
            List<CartItemDto> cart = (List<CartItemDto>) hse.getSession().getAttribute("cart");
            for (CartItemDto cartItemDto : cart) {
                    CartProducts cartProducts = new CartProducts();
                    cartProducts.setProduct(cartItemDto.getProduct());
                    cartProducts.setQuantity(cartItemDto.getQuantity());
                    int totalPrice = (int) (cartItemDto.getQuantity() * cartItemDto.getProduct().getPrice());
                    cartProducts.setTotalPrice(totalPrice);
                    cartProducts.setUser(user);
                    DomainFacade.addProductToCart(cartProducts);
                }
            }

        System.out.println("session destroyed");

    }

}
