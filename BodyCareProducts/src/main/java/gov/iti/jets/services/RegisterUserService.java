package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;

public interface RegisterUserService {
    boolean checkEmail(String email);
    boolean addUser (User user);

}