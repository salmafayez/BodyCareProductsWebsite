package gov.iti.jets.presentation.listeners;

import java.util.List;

import gov.iti.jets.persistence.entities.*;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.presentation.util.CookieHandler;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println("session created");
    }

    public void sessionDestroyed(HttpSessionEvent hse) {
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");
        HttpSession session = hse.getSession();
        System.out.println("before id");
        int id = (int) session.getAttribute("userId");
        System.out.println("afier id");
        System.out.println(id);
        User user = DomainFacade.getUser(id);
        if(user == null){
            System.out.println("user is null");
        }else{
            System.out.println("user is not null");
        }
        if (session.getAttribute("cart") == null) {
            System.out.println("Empty Cart Session");
        } else {
            System.out.println("not Empty Cart Session");
            List<CartItemDto> cart = (List<CartItemDto>) hse.getSession().getAttribute("cart");
            for (CartItemDto cartItemDto : cart) {
                    CartProducts cartProducts = new CartProducts();
                    cartProducts.setProduct(cartItemDto.getProduct());
                    cartProducts.setQuantity(cartItemDto.getQuantity());
                    int totalPrice = (int) (cartItemDto.getQuantity() * cartItemDto.getProduct().getPrice());
                    cartProducts.setTotalPrice(totalPrice);
                    cartProducts.setCartId(new CartId(user.getId(), cartItemDto.getProduct().getId()));
                    cartProducts.setUser(user);
                    DomainFacade.addProductToCart(cartProducts);
            }

            List<Product> productsList = (List<Product>)session.getAttribute("wishlist");

            productsList.forEach(p->{
                Wishlist wishlist = new Wishlist();
                wishlist.setProduct(p);
                wishlist.setUser(user);
                wishlist.setCartId(new WishlistId(user.getId(), p.getId()));
                DomainFacade.saveWishList(wishlist);

            });
        }

        System.out.println("session destroyed");

    }

}
