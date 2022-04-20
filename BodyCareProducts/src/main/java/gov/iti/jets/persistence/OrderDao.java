package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.Order;

import java.util.List;

public interface OrderDao {
    public List<Order> getAllOrders();
    public List<Order> getOrderByUserId(int id);
}
