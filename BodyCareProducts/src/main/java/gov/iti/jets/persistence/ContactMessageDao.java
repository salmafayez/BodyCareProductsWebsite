package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.ContactMessage;
import java.util.List;


public interface ContactMessageDao {
    boolean insert (ContactMessage contactMessage);
    List<ContactMessage> loadMessages();
}
