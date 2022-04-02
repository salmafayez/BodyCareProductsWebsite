package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.NoResultException;

public interface UserDao {
    boolean checkEmail (String email);
    boolean insert(User user);
    User login(String email) throws NoResultException;

}
