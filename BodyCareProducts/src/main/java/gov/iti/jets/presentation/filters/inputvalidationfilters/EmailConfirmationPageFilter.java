package gov.iti.jets.presentation.filters.inputvalidationfilters;

import java.io.IOException;
import java.net.http.HttpRequest;
import gov.iti.jets.presentation.util.InputValidation;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class EmailConfirmationPageFilter implements Filter {

    private InputValidation validator= InputValidation.getInstance();
    private RequestDispatcher requestDispatcher;
    private String errorMessage="";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        requestDispatcher = httpRequest.getRequestDispatcher("login.jsp");
        
        if(httpRequest.getMethod().toLowerCase().equals("post")){
            String email = httpRequest.getParameter("email");
            errorMessage = validator.EmailValidation(email);

            if (!errorMessage.isEmpty()) {
                httpRequest.setAttribute("errorMessage", errorMessage);
                requestDispatcher.forward(httpRequest, response);
            } else {
                chain.doFilter(httpRequest, response); 
            }
        }else{
            chain.doFilter(httpRequest, response); 
        }
    }
    
}
