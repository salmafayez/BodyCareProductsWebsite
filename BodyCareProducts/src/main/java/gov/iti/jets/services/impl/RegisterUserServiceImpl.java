package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.services.RegisterUserService;

public class RegisterUserServiceImpl implements RegisterUserService {
    @Override
    public boolean checkEmail(String email) {
        UserDao userDao = new UserDaoImpl();
        return userDao.checkEmail(email);
    }

    @Override
    public boolean addUser(User user) {
        UserDao userDao = new UserDaoImpl();
        return userDao.insert(user);
    }

    @Override
    public User getUser(int id) {
        UserDao userDao = new UserDaoImpl();
        return userDao.getUser(id);
    }
}
