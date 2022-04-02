package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.NoResultException;

public interface LoginService {
    User login(String email) throws NoResultException;
    
}
