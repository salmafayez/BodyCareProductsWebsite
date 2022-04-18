package gov.iti.jets.persistence.impl;

import java.util.List;
import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.util.ManagerFactory;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    @Override
    public boolean checkEmail(String email) {
        List<User> userList = entityManager.createQuery("select e from User e where e.email = ?1")
                .setParameter(1, email)
                .getResultList();
        return userList.size() > 0;
    }

    @Override
    public User login(String email) throws NoResultException {
        Query query = entityManager.createQuery("SELECT user FROM User user WHERE user.email=:email");
        query.setParameter("email", email);
        User user = (User) query.getSingleResult();
        return user;
    }

    @Override
    public boolean insert(User user) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        return true;
    }

    @Override
    public boolean updatePassword(String email , String password) {
        EntityTransaction transaction = entityManager.getTransaction();
        Query query = entityManager.createQuery("SELECT user FROM User user WHERE user.email=:email");
        query.setParameter("email", email);
        User user = (User) query.getSingleResult();
        user.setPassword(password);
        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        return true;
    }

    @Override
    public User getUser(int id) {
        User user =entityManager.find(User.class,id);
        return user;
    }

    @Override
    public boolean updateUser(Integer id, UpdatedUserDto updatedUserDto) {
        EntityTransaction transaction = entityManager.getTransaction();
        Query query = entityManager.createQuery("SELECT user FROM User user WHERE user.id=:id");
        query.setParameter("id", id);
        User user = (User) query.getSingleResult();

        user.setUserName(updatedUserDto.getUserName());
        user.setPhoneNumber(updatedUserDto.getPhoneNumber());
        user.setEmail(updatedUserDto.getEmail());
        user.setPassword(updatedUserDto.getPassword());
        user.setCity(updatedUserDto.getCity());
        user.setCountry(updatedUserDto.getCountry());
        user.setDetailedAddress(updatedUserDto.getDetailedAddress());
        user.setWallet(updatedUserDto.getWallet());

        transaction.begin();
        entityManager.persist(user);
        transaction.commit();
        return true;
    }

}
