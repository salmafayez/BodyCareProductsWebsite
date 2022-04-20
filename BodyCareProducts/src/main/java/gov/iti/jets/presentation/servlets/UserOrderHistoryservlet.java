package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class UserOrderHistoryservlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //List<Order> users = DomainFacade.loadAllUses();

        System.out.println("arrived in users history");
        //request.setAttribute("users", users);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-user-history.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}
