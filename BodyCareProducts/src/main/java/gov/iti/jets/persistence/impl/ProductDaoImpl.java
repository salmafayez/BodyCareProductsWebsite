package gov.iti.jets.persistence.impl;

import java.util.List;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

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

    @Override
    public List<Product> load() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p",Product.class);
        List<Product> result =query.getResultList();
        entityManager.close();
        return result;
    }

    @Override
    public List<Product> loadByCategory(String category) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.categoryName =:categoryName",Product.class);
        query.setParameter("categoryName",category);
        List<Product> result =query.getResultList();
        entityManager.close();
        return result;
    }
    
}
