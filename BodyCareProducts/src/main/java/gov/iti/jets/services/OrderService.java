package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.Order;

public interface OrderService {
    void saveOrder(Order order);
}
