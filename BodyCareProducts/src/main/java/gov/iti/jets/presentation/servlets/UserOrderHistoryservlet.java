package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class UserOrderHistoryServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        System.out.println("hreeeeeeeeeeeeeeeee");
        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        if(userId != null){
         System.out.println("here order history " + userId);
         List<Order> orders = DomainFacade.getOrderByUserId(userId);
         for (Order order : orders) {
         System.out.println(orders.size() + "hhh" + order.getId() +
         order.getUser().getUserName());
         }
            System.out.println("arrived in order history");
            request.setAttribute("orders", orders);

        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("order-history.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }
}
