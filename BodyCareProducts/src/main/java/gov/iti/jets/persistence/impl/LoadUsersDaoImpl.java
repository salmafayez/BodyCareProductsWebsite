package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.LoadUsersDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class LoadUsersDaoImpl implements LoadUsersDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    @Override
    public List<User> loadUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u ",User.class);
        List<User> users =query.getResultList();
        return users;
    }
}
