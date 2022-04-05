package gov.iti.jets.presentation.filters.inputvalidationfilters;

import java.io.IOException;

import gov.iti.jets.presentation.util.InputValidation;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginPageFilter implements Filter {
   
    private InputValidation validator= InputValidation.getInstance();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
    
        String email = request.getParameter("email");
        boolean valid = validator.EmailValidation(email);

        if (email == null || "".equals(email)) {
            request.setAttribute("errMsg", "Email shouldn't be emtpy");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        } else if (!valid) {
            request.setAttribute("errMsg", "Email format not valid");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        } else {
            chain.doFilter(request, response); 
        }
    }
}