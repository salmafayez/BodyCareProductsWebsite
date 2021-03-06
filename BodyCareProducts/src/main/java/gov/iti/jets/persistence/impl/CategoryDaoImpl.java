package gov.iti.jets.persistence.impl;

import java.util.List;
import gov.iti.jets.persistence.CategoryDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.*;

public class CategoryDaoImpl implements CategoryDao{

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    @Override
    public List<Category> getAll() {
        String select = "SELECT c FROM Category c";
        Query query = entityManager.createQuery(select);
        List<Category> categoryList = query.getResultList();
        return categoryList;

    }

    @Override
    public boolean insert(Category category) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(category);
        transaction.commit();
        return true;
    }

    @Override
    public Category getCategory(String categoryName) {
        String select = "SELECT c FROM Category c WHERE c.name=:categoryName";
        Query query = entityManager.createQuery(select,Category.class);
        query.setParameter("categoryName", categoryName);
        Category category = (Category) query.getSingleResult();
        return category;
    }

    @Override
    public List<Category> getAllCategories() {
        TypedQuery<Category> query = entityManager.createQuery("select m from Category m", Category.class);
        List<Category> messages = query.getResultList();
        return messages;
    }
}
