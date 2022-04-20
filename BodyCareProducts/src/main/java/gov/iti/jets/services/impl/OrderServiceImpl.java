package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.OrderDao;
import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.impl.OrderDaoImpl;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.services.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

      @Override
    public void saveOrder(Order order) {
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(order);
    @Override
    public List<Order> getAllOrders() {
        OrderDao orderDao = new OrderDaoImpl();
        return orderDao.getAllOrders();
    }

    @Override
    public List<Order> getOrderByUserId(int id) {
        OrderDao orderDao = new OrderDaoImpl();
        return orderDao.getAllOrders();

    }
}
