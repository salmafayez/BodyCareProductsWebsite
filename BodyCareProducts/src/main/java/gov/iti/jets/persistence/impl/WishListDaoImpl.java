package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.WishListDao;
import gov.iti.jets.persistence.entities.Wishlist;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class WishListDaoImpl implements WishListDao {
    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    @Override
    public void saveWishList(Wishlist wishlist) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(wishlist);
        transaction.commit();
    }

}
