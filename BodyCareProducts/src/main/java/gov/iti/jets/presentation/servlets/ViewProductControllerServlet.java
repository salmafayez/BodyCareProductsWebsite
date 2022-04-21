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

public class ViewProductControllerServlet extends HttpServlet {  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int productId = Integer.parseInt(request.getParameter("id"));
        Product product = DomainFacade.getProductById(productId);
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product.jsp");
        requestDispatcher.forward(request, response);    
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //  int page=1;
        // int recordsPerPage=9;
        // if(request.getParameter("page")!=null)
        //     page=Integer.parseInt(request.getParameter("page"));
        // String searchProduct = request.getParameter("searchProduct");
        // List<Product> products = DomainFacade.searchProducts(searchProduct, (page-1)*recordsPerPage, recordsPerPage);
        
        // Long noOfRecords = DomainFacade.getNoOfRecords();
        // int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
        // request.setAttribute("products", products);
        // request.setAttribute("noOfPages", noOfPages);
        // request.setAttribute("currentPage", page);
        
        // RequestDispatcher requestDispatcher = request.getRequestDispatcher("shop.jsp");
        // requestDispatcher.forward(request, response);
    }

}