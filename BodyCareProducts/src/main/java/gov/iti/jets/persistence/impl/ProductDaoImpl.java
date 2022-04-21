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
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class ProductDaoImpl implements ProductDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();
    private static Long noOfRecords;

    @Override
    public boolean insert(Product product) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(product); 
        transaction.commit();
        return true;
    }

    @Override
    public List<Product> load(int offset, int noOfRecords) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p ",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        
        List<Product> result =query.getResultList();
        Query query2 = entityManager.createQuery("select count(p) from Product p");
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        return result;
    }


    @Override
    public List<Product> loadByCategory(String category, int offset, int noOfRecords) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.categoryName =:categoryName",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        query.setParameter("categoryName",category);
        List<Product> result =query.getResultList();
        Query query2 = entityManager.createQuery("select count(p) from Product p where p.categoryName =:categoryName");
        query2.setParameter("categoryName",category);
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        return result;
    }

    @Override
    public Long getNoOfRecords() {

        return noOfRecords;
    }

    @Override
    public List<Product> searchProducts(String searchProduct, int offset, int noOfRecords) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.name like : name ",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        query.setParameter("name","%" + searchProduct + "%");
        List<Product> result =query.getResultList();
        Query query2 = entityManager.createQuery("select count(p) from Product p where p.name like : name ");
        query2.setParameter("name","%" + searchProduct + "%");
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        return result;
    }

    @Override
    public Product getProductById(int id) {
        CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
        CriteriaQuery<Product> query = cb.createQuery(Product.class);
        Root<Product> productRoot = query.from(Product.class);
        query.select(productRoot).where(cb.equal(productRoot.get("id"),id));
        List<Product> result1 = entityManager.createQuery(query).getResultList();
        return result1.get(0);
    }

    @Override
    public Product getProduct(int id) {
        String select = "SELECT p FROM Product p where p.id=:id";
        Query query = entityManager.createQuery(select);
        query.setParameter("id", id);
        List<Product> product = query.getResultList();
        return product.get(0);
    }

    @Override
    public List<Product> getProductByPrice(double max, double min, int offset, int noOfRecords) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.price between : min and : max",Product.class).setMaxResults(noOfRecords).setFirstResult(offset);
        query.setParameter("max",max);
        query.setParameter("min",min);
        List<Product> result =query.getResultList();
       
        Query query2 = entityManager.createQuery("select count(p) from Product p where p.price between : min and : max");
        query2.setParameter("max",max);
        query2.setParameter("min",min);
        Long result2 = (Long) query2.getSingleResult();
        this.noOfRecords=result2;
        return result;
    }

    @Override
    public double getMax() {
        Query query2 = entityManager.createQuery("select max (x.price) from Product x");
        double result2 = (double) query2.getSingleResult();
        return result2;
    }

    @Override
    public double getMin() {
        Query query2 = entityManager.createQuery("select min (x.price) from Product x");
        double result2 = (double) query2.getSingleResult();
        return result2;
    }
}
