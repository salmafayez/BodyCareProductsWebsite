package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.ContactMessageDao;
import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class ContactMessageDaoImpl implements ContactMessageDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    @Override
    public boolean insert(ContactMessage contactMessage) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(contactMessage);
        transaction.commit();
        entityManager.close();
        return true;
    }
}
