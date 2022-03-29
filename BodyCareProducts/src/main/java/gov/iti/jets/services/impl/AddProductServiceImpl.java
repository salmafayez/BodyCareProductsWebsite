package gov.iti.jets.services.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.AddProductService;

public class AddProductServiceImpl implements AddProductService {

    @Override
    public void addProduct(Product product) {
        EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(product); 
        transaction.commit();
        entityManager.close();
    }
}
