package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import gov.iti.jets.persistence.entities.LineItem;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.presentation.dtos.LineItemDto;
import gov.iti.jets.presentation.dtos.OrderDto;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class OrderDtoMapper implements RequestMapper<OrderDto>{

    @Override
    public OrderDto map(HttpServletRequest request) throws IOException, ServletException {
        List<CartItemDto> cart = (List<CartItemDto>) request.getSession().getAttribute("cart");
        OrderDto order = new OrderDto();
        double totalPrice = 0;
        for (int i = 0 ; i < cart.size() ; i++){
            Product product = DomainFacade.getProduct(cart.get(i).getProduct().getId());
            totalPrice += cart.get(i).getQuantity() * cart.get(i).getProduct().getPrice();
            LineItemDto lineItemDto = new LineItemDto();
            lineItemDto.setProductName(product.getName());
            lineItemDto.setProductPrice(product.getPrice());
            lineItemDto.setProductQuantity(cart.get(i).getQuantity());
            order.getLineItemList().add(lineItemDto);
        }
        order.setOrderTime(LocalDate.now());
        order.setTotalPrice(totalPrice);
        order.setUser((User)request.getSession().getAttribute("currentUser"));
        return order;
    }
    
}
