package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.persistence.util.EntityFactory;
import gov.iti.jets.services.LoginService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

public class LoginServiceImpl implements LoginService{

    @Override
    public User login(String email)throws NoResultException {
        EntityManager entityManager = EntityFactory.getEntityManager();
        UserDao userDao = new UserDaoImpl(entityManager);
        User user = userDao.login(email);
        return user;
    }
}