package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

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
    public boolean insert(User user) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();

        return true;
    }
}
