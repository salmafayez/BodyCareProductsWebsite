package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.OrderDao;
import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.EntityTransaction;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public List<Order> getAllOrders() {
        System.out.println("here on daooooooooooo" + "allaaaaaaaaa org=deee");

        TypedQuery<Order> query = entityManager.createQuery("select m from Order m", Order.class);
        List<Order> messages = query.getResultList();
        return messages;
    }

    @Override
    public List<Order> getOrderByUserId(int id) {
//        CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
//        CriteriaQuery<Order> query = cb.createQuery(Order.class);
//        Root<Order> orderRoot = query.from(Order.class);
//        Predicate predicate = cb.equal(orderRoot.get("user").<Integer>get("id"), id);
//        query.select(orderRoot).where(predicate);
//        List<Order> result = entityManager.createQuery(query).getResultList();

        System.out.println("here on daooooooooooo" + id);
        CriteriaBuilder cb = entityManagerFactory.getCriteriaBuilder();
        CriteriaQuery<Order> query = cb.createQuery(Order.class);
        Root<Order> userOrder = query.from(Order.class);
        Predicate predicate = cb.equal(userOrder.get("user").<Integer>get("id"), id);
        query.select(userOrder).where(predicate);
        List<Order> result = entityManager.createQuery(query).getResultList();
        return result;
    }
        @Override
    public void saveOrder(Order order) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(order);
        transaction.commit();

    }
}
