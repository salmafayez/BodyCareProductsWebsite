package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.ContactMessageDao;
import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.util.ManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ContactMessageDaoImpl implements ContactMessageDao {

    private final static EntityManagerFactory entityManagerFactory = ManagerFactory.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public boolean insert(ContactMessage contactMessage) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(contactMessage);
        transaction.commit();
        return true;
    }

    @Override
    public List<ContactMessage> loadMessages() {
        TypedQuery<ContactMessage> query = entityManager.createQuery("select m from ContactMessage m",ContactMessage.class);
        List<ContactMessage> messages =query.getResultList();
        return messages ;
    }
}
