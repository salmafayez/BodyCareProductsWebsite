package gov.iti.jets.persistence.impl;

import java.util.List;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
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
        System.out.println("hh");
        System.out.println(result);
        System.out.println(result.size());
        System.out.println("ppp");
        entityManager.close();
        return result;
    }

    @Override
    public Product getProduct(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String select = "SELECT p FROM Product p where p.id=:id";
        Query query = entityManager.createQuery(select);
        query.setParameter("id", id);
        List<Product> product = query.getResultList();
        entityManager.close();
        return product.get(0);
    }
    
}
