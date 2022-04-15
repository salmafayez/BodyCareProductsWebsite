package gov.iti.jets.presentation.filters.inputvalidationfilters;

import java.io.IOException;
import gov.iti.jets.presentation.util.InputValidation;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class LoginPageFilter implements Filter {
   
    private InputValidation validator= InputValidation.getInstance();
    private String errorMessage="";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        if(httpRequest.getMethod().toLowerCase().equals("post")){
            String email = httpRequest.getParameter("email");
            errorMessage = validator.EmailValidation(email);

            if (!errorMessage.isEmpty()) {
                httpRequest.setAttribute("errorMessage", errorMessage);
                httpRequest.getRequestDispatcher("login.jsp").forward(httpRequest, response);
            } else {
                chain.doFilter(httpRequest, response); 
            }
        }else{
            chain.doFilter(httpRequest, response); 
        }
    }
}