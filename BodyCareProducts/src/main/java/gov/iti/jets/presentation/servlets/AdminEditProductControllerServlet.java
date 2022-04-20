package gov.iti.jets.presentation.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ProductDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class AdminEditProductControllerServlet extends HttpServlet { 
    
    private static final RequestMapper<Product> productMapper= new ProductDtoMapper();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int productId;
        if(request.getParameter("id")!=null){
            productId=Integer.parseInt(request.getParameter("id"));
            Product product = DomainFacade.getProduct(productId);
            request.setAttribute("product", product);
           
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-edit-product.jsp");
            requestDispatcher.forward(request, response);
    }

       
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        Product product = new Product();
        int id = Integer.parseInt(request.getParameter("id")) ;
        
        product.setName(request.getParameter("productName"));
        product.setPrice(Double.parseDouble(request.getParameter("price")));
        product.setDescription(request.getParameter("description"));
        product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
        product.setCategoryName(request.getParameter("category"));
        product.setId(id);
        
        // Part part = request.getPart("productImage");
        // product.setImage(part.getSubmittedFileName());
       
        boolean result = DomainFacade.editProduct(product);
       
        if(result){
            System.out.println("DOONNNNEEEE");
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
            request.setAttribute("updated", 1);
        
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-product-history.jsp");
            requestDispatcher.forward(request, response);
        }
        else{
            System.out.println("NOT DONE");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-product-history.jsp");
            requestDispatcher.forward(request, response);
        }
        
    }  

   
}