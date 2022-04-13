package gov.iti.jets.services;


import gov.iti.jets.persistence.entities.User;

import java.util.List;

public interface UsersHistoryService {

    public List<User> loadAllUsers();
}
