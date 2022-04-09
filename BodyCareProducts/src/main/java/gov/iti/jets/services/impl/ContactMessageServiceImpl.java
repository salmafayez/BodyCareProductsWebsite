package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.ContactMessageDao;
import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.impl.ContactMessageDaoImpl;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.services.ContactMessageService;

public class ContactMessageServiceImpl implements ContactMessageService {
    @Override
    public boolean addContactMessage(ContactMessage contactMessage) {

        ContactMessageDao contactMessageDao = new ContactMessageDaoImpl();
        return contactMessageDao.insert(contactMessage);
    }
}
