package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.persistence.entities.LineItem;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class OrderDtoMapper implements RequestMapper<Order>{

    @Override
    public Order map(HttpServletRequest request) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        List<CartItemDto> cart = (List<CartItemDto>) session.getAttribute("cart");
        Order order = new Order();
        double totalPrice = 0;
        for (int i = 0 ; i< cart.size() ; i++){
            Product product = DomainFacade.getProduct(cart.get(i).getProduct().getId());
            totalPrice += cart.get(i).getQuantity() * cart.get(i).getProduct().getPrice();
            LineItem lineItem = new LineItem();
            lineItem.setProductName(product.getName());
            lineItem.setProductPrice(product.getPrice());
            lineItem.setProductQuantity(cart.get(i).getQuantity());
            order.getLineItemList().add(lineItem);
        }
        int id = (Integer)session.getAttribute("userId");
        User user = DomainFacade.getUser(id);
        order.setOrderTime(LocalDate.now());
        order.setTotalPrice(totalPrice);
        order.setUser(user);
        return order;
    }
    
}
