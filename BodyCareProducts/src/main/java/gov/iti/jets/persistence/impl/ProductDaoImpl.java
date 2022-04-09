package gov.iti.jets.persistence.impl;

import java.util.List;

import org.hibernate.bytecode.enhance.internal.tracker.NoopCollectionTracker;

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
    private static Long noOfRecords;

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
    public List<Product> load(int offset, int noOfRecords) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p ",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        List<Product> result =query.getResultList();
        Query query2 = entityManager.createQuery("select count(p) from Product p");
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        entityManager.close();
        return result;
    }
    

    @Override
    public List<Product> loadByCategory(String category, int offset, int noOfRecords) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.categoryName =:categoryName",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        query.setParameter("categoryName",category);
        List<Product> result =query.getResultList();
        Query query2 = entityManager.createQuery("select count(p) from Product p where p.categoryName =:categoryName");
        query2.setParameter("categoryName",category);
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        entityManager.close();
        return result;
    }

    @Override
    public Long getNoOfRecords() {
       return noOfRecords;
    }
    
}
