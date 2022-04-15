package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.ContactMessage;

import java.util.List;


public interface ContactMessageService {

    boolean addContactMessage (ContactMessage contactMessage);
    public List<ContactMessage> loadAllMessages();
}
