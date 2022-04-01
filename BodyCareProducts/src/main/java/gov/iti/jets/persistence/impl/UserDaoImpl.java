package gov.iti.jets.persistence.impl;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {
    private EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public User login(String email, String password) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        String select = "SELECT user FROM User user WHERE user.email=:email and user.password=:password";
        Query query = entityManager.createQuery(select);
        query.setParameter("email", email);
        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        entityManager.close();
        return user;
    }
    
}
