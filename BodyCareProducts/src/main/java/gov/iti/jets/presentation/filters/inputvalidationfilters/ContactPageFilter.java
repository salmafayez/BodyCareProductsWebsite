package gov.iti.jets.presentation.filters.inputvalidationfilters;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import gov.iti.jets.presentation.util.InputValidation;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class ContactPageFilter implements Filter{
    
    private InputValidation validator= InputValidation.getInstance();
    private RequestDispatcher requestDispatcher;
    private Map<String,String> validationMap = new HashMap<>();
    private Map<String,String> errorMap = new HashMap<>();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        requestDispatcher = httpRequest.getRequestDispatcher("addcontact.jsp");

        if(httpRequest.getMethod().toLowerCase().equals("post")){

            constructValidationMap(httpRequest);
            constructErrorMap();
            
            if (errorMap.size()!=0) {
                httpRequest.setAttribute("errorsMap", errorMap);
                requestDispatcher.forward(httpRequest, response);
            } else {
                chain.doFilter(httpRequest, response); 
            }
        }else{
            chain.doFilter(httpRequest, response); 
        }
    }

    private void constructValidationMap(HttpServletRequest httpRequest){
        validationMap.put("userName-validate",validator.validateUserName(httpRequest.getParameter("username")));
        validationMap.put("email-validate",validator.EmailValidation(httpRequest.getParameter("email")));
        validationMap.put("message-validate",validator.validateMessage(httpRequest.getParameter("message")));
    }

    private void constructErrorMap(){
        if(!validationMap.get("userName-validate").isEmpty()){
            errorMap.put("username-error", validationMap.get("userName-validate"));
        }
        if(!validationMap.get("email-validate").isEmpty()){
            errorMap.put("email-error", validationMap.get("email-validate"));
        }
        if(!validationMap.get("message-validate").isEmpty()){
            errorMap.put("message-error", validationMap.get("message-validate"));
        }
    }
    
}
