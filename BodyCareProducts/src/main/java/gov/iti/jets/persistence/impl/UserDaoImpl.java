package gov.iti.jets.persistence.impl;

import java.util.List;
import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();

    @Override
    public boolean checkEmail(String email) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<User> userList = entityManager.createQuery("select e from User e where e.email = ?1")
                .setParameter(1, email)
                .getResultList();

        entityManager.close();

        return userList.size() > 0;
    }

    @Override
    public User login(String email) throws NoResultException {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String select = "SELECT user FROM User user WHERE user.email=:email";
        Query query = entityManager.createQuery(select);
        query.setParameter("email", email);
        User user = (User) query.getSingleResult();
        entityManager.close();
        return user;
    }

    @Override
    public boolean insert(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean updatePassword(String email , String password) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String select = "SELECT user FROM User user WHERE user.email=:email";
        Query query = entityManager.createQuery(select);
        query.setParameter("email", email);
        User user = (User) query.getSingleResult();
        user.setPassword(password);
        entityManager.persist(user);
        transaction.commit();
        entityManager.close();
        return true;
    }

    @Override
    public User getUser(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String select = "SELECT c FROM User c WHERE c.id=:userid";
        Query query = entityManager.createQuery(select, User.class);
        query.setParameter("userid", id);
        User user = (User) query.getSingleResult();
        entityManager.close();
        return user;
    }

}
