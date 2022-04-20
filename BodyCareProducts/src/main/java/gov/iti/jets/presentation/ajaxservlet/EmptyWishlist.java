package gov.iti.jets.presentation.ajaxservlet;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EmptyWishlist extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("salma salma salma salma ");
        response.sendRedirect("wishlist");
    }
}
