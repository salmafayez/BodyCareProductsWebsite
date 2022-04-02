package gov.iti.jets.persistence.impl;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {

    private final EntityManager entityManager;

    public UserDaoImpl (EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public boolean checkEmail(String email) {

        List<User> userList = entityManager.createQuery(
                        "select e from User e where e.email = ?1")
                .setParameter(1, email)
                .getResultList();

        entityManager.close();

        return userList.size() > 0;
    }

    @Override
    public User login(String email) throws NoResultException {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        User user = null;
        String select = "SELECT user FROM User user WHERE user.email=:email";
        Query query = entityManager.createQuery(select);
        query.setParameter("email", email);
        user = (User) query.getSingleResult();
    public boolean insert(User user) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
        return user;
    }

        return true;
    }
}
