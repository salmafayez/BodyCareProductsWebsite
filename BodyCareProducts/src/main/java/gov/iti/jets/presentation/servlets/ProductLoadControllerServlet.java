package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.List;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductLoadControllerServlet extends HttpServlet {  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String category = request.getParameter("category");
        int page=1;
        int recordsPerPage=9;
        if(request.getParameter("page")!=null)
            page=Integer.parseInt(request.getParameter("page"));
        if(category==null){
            List<Product> products1 = DomainFacade.loadAllProducts((page-1)*recordsPerPage,recordsPerPage);
           
            Long noOfRecords = DomainFacade.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            request.setAttribute("products", products1);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
        }
        else{
            List<Product> products2 = DomainFacade.loadProductsByCategory(category,(page-1)*recordsPerPage,recordsPerPage);
            Long noOfRecords = DomainFacade.getNoOfRecords();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);   
            request.setAttribute("products", products2);
            request.setAttribute("noOfPages", noOfPages);
            request.setAttribute("currentPage", page);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("shop.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

}