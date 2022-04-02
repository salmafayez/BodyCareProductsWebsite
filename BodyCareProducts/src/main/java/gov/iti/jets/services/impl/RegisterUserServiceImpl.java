package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.impl.ProductDaoImpl;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.persistence.util.EntityFactory;
import gov.iti.jets.services.RegisterUserService;
import jakarta.persistence.EntityManager;

public class RegisterUserServiceImpl implements RegisterUserService {
    @Override
    public boolean checkEmail(String email) {
        EntityManager entityManager = EntityFactory.getEntityManager();
        UserDao userDao = new UserDaoImpl(entityManager);
        return userDao.checkEmail(email);
    }

    @Override
    public boolean addUser(User user) {
        EntityManager entityManager = EntityFactory.getEntityManager();
        UserDao userDao = new UserDaoImpl(entityManager);
        return userDao.insert(user);
    }
}
