package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ProductDaoImpl implements ProductDao {

    private EntityManager entityManager;

    public ProductDaoImpl (EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public boolean insert(Product product) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(product); 
        transaction.commit();
        entityManager.close();
        return true;
    }
    
}
