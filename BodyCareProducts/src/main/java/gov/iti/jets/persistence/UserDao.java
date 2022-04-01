package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.NoResultException;

public interface UserDao {
    public User login(String email) throws NoResultException;
    
}
