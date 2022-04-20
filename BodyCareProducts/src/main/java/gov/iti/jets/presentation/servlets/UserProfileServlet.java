package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.util.DomainFacade;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.nio.file.FileStore;
import java.util.List;

public class UserProfileServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        HttpSession session= request.getSession();
        Integer userId= (Integer) session.getAttribute("userId");
        User user=DomainFacade.getUser(userId);

        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user-profile.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}