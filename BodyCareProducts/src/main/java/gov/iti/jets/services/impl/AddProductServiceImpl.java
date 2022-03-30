package gov.iti.jets.services.impl;

import jakarta.persistence.*;

import gov.iti.jets.persistence.entities.Product;
//import gov.iti.jets.persistence.util.ManagerFactory;
import gov.iti.jets.services.AddProductService;

public class AddProductServiceImpl implements AddProductService {

    @Override
    public void addProduct(Product product) {
        
        EntityManager entityManager = Persistence.createEntityManagerFactory("myapp").createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(product); 
        transaction.commit();
        //entityManager.close();
    }
}
