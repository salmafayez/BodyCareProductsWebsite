package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.LoadUsersDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.impl.LoadUsersDaoImpl;
import gov.iti.jets.services.UsersHistoryService;

import java.util.List;

public class UsersHistroyServiceImpl implements UsersHistoryService {
    @Override
    public List<User> loadAllUsers() {
        LoadUsersDao loadUsersDao =new LoadUsersDaoImpl();
        return loadUsersDao.loadUsers();
    }
}
