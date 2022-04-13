package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.User;

import java.util.List;

public interface LoadUsersDao {
    public List<User> loadUsers();

}
