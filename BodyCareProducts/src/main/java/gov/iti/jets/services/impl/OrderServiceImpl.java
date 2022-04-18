package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.OrderDao;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.impl.OrderDaoImpl;
import gov.iti.jets.services.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public void saveOrder(Order order) {
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(order);
    }
}
