package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LoadAdminDataServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("here");

        List<User> users = DomainFacade.loadAllUses();
        int userLength = 0;
        if (users != null) {
            userLength = users.size();
        }
        System.out.println("userLength"  + userLength);
        request.setAttribute("userLength", userLength+"");

        List<Product> products = DomainFacade.getAllProducts();
        int productLength = 0;
        if (products != null) {
            productLength = products.size();
        }
        System.out.println("productLength"  + productLength);
        request.setAttribute("productLength", productLength+"");

        List<Order> orders = DomainFacade.getAllOrders();
        int orderLength = 0;
        if (orders != null) {
            orderLength = orders.size();
        }
        System.out.println("orderLength"  + orderLength);
        request.setAttribute("orderLength", orderLength+"");

        List<Category> categories = DomainFacade.getAllCategories();
        int categoryLength = 0;
        if (categories != null) {
            categoryLength = categories.size();
        }
        System.out.println("categoryLength"  + categoryLength);
        request.setAttribute("categoryLength", categoryLength+"");


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-dashboard.jsp");
        requestDispatcher.forward(request, response);
    }


}
