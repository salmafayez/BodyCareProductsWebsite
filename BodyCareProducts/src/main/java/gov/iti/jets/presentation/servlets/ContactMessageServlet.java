package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ContactMessageDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ContactMessageServlet extends HttpServlet {

    private static final RequestMapper<ContactMessage> contactMessageMapper= new ContactMessageDtoMapper();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("arrived in get!!");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact.jsp");
        requestDispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("arrived in contactt!!");
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        ContactMessage contactMessage = contactMessageMapper.map(request) ;
        Boolean test = DomainFacade.addContactMessage(contactMessage);
        if(test){

            response.sendRedirect("index.jsp");
        }else{
            out.println("<script>alert('message failed please try again !!')</script>");
        }




    }
}
