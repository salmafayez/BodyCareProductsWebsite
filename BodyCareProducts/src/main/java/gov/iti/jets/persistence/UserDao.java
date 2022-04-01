package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.User;

public interface UserDao {
    public User login(String email, String password);
    
}
