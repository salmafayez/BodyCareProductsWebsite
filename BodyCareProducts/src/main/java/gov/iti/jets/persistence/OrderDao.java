package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.Order;

public interface OrderDao {

    void saveOrder(Order order);
}
