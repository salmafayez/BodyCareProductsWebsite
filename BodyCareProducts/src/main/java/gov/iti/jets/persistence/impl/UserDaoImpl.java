package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;

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

        if(userList.size() > 0){
            return true;
        }else {
            return false;
        }
    }
}
