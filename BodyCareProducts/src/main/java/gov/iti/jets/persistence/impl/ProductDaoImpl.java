package gov.iti.jets.persistence.impl;

import java.util.List;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

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

    @Override
    public Product getProductById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
        CriteriaQuery<Product> query = cb.createQuery(Product.class);
        Root<Product> productRoot = query.from(Product.class);
        query.select(productRoot).where(cb.equal(productRoot.get("id"),id));

        List<Product> result1 = entityManager.createQuery(query).getResultList();
        return result1.get(0);
    }

}
