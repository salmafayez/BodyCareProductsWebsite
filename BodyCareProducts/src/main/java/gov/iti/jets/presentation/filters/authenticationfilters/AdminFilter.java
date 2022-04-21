package gov.iti.jets.presentation.filters.authenticationfilters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = request1.getSession();
        if(session.getAttribute("isAdmin") == null){
            httpResponse.sendRedirect("page-not-found");
        }else{
            chain.doFilter(request1,httpResponse);
        }
    }
}
