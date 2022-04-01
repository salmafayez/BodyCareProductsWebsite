package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.User;

public interface LoginService {
    public User login(String email, String password);
    
}
