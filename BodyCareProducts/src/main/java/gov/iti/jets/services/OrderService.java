package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAllOrders();
    public List<Order> getOrderByUserId(int id);
}
