package gov.iti.jets.services;
import gov.iti.jets.persistence.entities.User;

public interface RegisterUserService {
    boolean checkEmail(String email);
    boolean addUser (User user);
    User getUser (int id);


}
