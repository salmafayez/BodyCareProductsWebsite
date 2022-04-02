package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;

public interface UserDao {
    boolean checkEmail (String email);
    boolean insert(User user);
}
