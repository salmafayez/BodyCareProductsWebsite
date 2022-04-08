package gov.iti.jets.persistence.impl;

import java.util.List;

import gov.iti.jets.persistence.CategoryDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class CategoryDaoImpl implements CategoryDao{

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    
    @Override
    public List<Category> getAll() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String select = "SELECT c FROM Category c";
        Query query = entityManager.createQuery(select);
        List<Category> categoryList = query.getResultList();
        entityManager.close();;
        return categoryList;

    }

    @Override
    public boolean insert(Category category) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(category);
        transaction.commit();
        entityManager.close();
        return true;
    }

    @Override
    public Category getCategory(String categoryName) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String select = "SELECT c FROM Category c WHERE c.name=:categoryName";
        Query query = entityManager.createQuery(select,Category.class);
        query.setParameter("categoryName", categoryName);
        Category category = (Category) query.getSingleResult();
        entityManager.close();
        return category;
    }
}
