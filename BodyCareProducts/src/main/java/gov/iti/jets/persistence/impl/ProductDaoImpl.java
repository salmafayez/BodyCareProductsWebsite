package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class ProductDaoImpl implements ProductDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();

    @Override
    public boolean insert(Product product) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(product); 
        transaction.commit();
        entityManager.close();
        return true;
    }
    
}
