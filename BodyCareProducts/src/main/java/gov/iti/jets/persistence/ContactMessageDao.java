package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.ContactMessage;


public interface ContactMessageDao {
    boolean insert (ContactMessage contactMessage);
}
