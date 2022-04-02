package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ProductDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@MultipartConfig
public class AddCategoryServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-add-category.jsp");
        requestDispatcher.forward(request, response);
    } 

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String categoryName = request.getParameter("category-name");
        Category category = new Category();
        category.setName(categoryName);
        boolean result = DomainFacade.addCategory(category);
        request.setAttribute("addProduct", result);
        log(result+"");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin-add-category.jsp");
        requestDispatcher.forward(request, response);

    }  
}
