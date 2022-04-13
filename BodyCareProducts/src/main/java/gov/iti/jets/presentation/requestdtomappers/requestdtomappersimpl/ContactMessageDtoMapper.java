package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;

import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

import java.io.IOException;

public class ContactMessageDtoMapper implements RequestMapper<ContactMessage> {


    @Override
    public ContactMessage map(HttpServletRequest request) throws IOException, ServletException {
        ContactMessage contactMessage = new ContactMessage();
        contactMessage.setContactName(request.getParameter("contactName"));
        contactMessage.setContactEmail(request.getParameter("contactEmail"));
        contactMessage.setContactMessage(request.getParameter("contactMessage"));
        return contactMessage;
    }
}
