package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.List;

import org.hibernate.validator.internal.util.DomainNameUtil;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminProductLoadControllerServlet extends HttpServlet {  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int page=1;
        int recordsPerPage=12;
        if(request.getParameter("page")!=null)
            page=Integer.parseInt(request.getParameter("page"));
            List<Product> products1 = DomainFacade.loadAllProducts((page-1)*recordsPerPage,recordsPerPage);
           
            Long noOfRecords = DomainFacade.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("products", products1);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-product-history.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

}