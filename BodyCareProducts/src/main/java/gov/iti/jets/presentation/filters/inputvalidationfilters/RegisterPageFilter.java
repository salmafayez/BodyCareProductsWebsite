package gov.iti.jets.presentation.filters.inputvalidationfilters;

import java.io.IOException;
import java.time.LocalDate;
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

public class RegisterPageFilter implements Filter{
    
    private InputValidation validator= InputValidation.getInstance();
    private RequestDispatcher requestDispatcher;
    private Map<String,String> validationMap = new HashMap<>();
    private Map<String,String> errorMap = new HashMap<>();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        requestDispatcher = httpRequest.getRequestDispatcher("register.jsp");

        if(httpRequest.getMethod().toLowerCase().equals("post")){

            constructValidationMap(httpRequest);
            constructErrorMap();
            //LocalDate birthdate = LocalDate.parse(request.getParameter("birthday"));
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
        validationMap.put("password-validate",validator.validatePassword(httpRequest.getParameter("password")));
        validationMap.put("phoneNumber-validate",validator.validatePhoneNumber(httpRequest.getParameter("phoneNumber")));
        validationMap.put("address-validate", validator.validateAddress(httpRequest.getParameter("address")));
        validationMap.put("job-validate", validator.validateJob(httpRequest.getParameter("job")));
        validationMap.put("creditLimit-validate",validator.validateCreditLimit(Double.parseDouble(httpRequest.getParameter("creditLimit"))));
    }

    private void constructErrorMap(){
        if(!validationMap.get("userName-validate").isEmpty()){
            errorMap.put("username-error", validationMap.get("userName-validate"));
        }
        if(!validationMap.get("email-validate").isEmpty()){
            errorMap.put("email-error", validationMap.get("email-validate"));
        }
        if(!validationMap.get("password-validate").isEmpty()){
            errorMap.put("password-error", validationMap.get("password-validate"));
        }
        if(!validationMap.get("phoneNumber-validate").isEmpty()){
            errorMap.put("phonenumber-error", validationMap.get("phoneNumber-validate"));
        }
        if(!validationMap.get("address-validate").isEmpty()){
            errorMap.put("address-error", validationMap.get("address-validate"));
        }
        if(!validationMap.get("job-validate").isEmpty()){
            errorMap.put("job-error", validationMap.get("job-validate"));
        }
        if(!validationMap.get("creditLimit-validate").isEmpty()){
            errorMap.put("creditlimit-error", validationMap.get("creditLimit-validate"));
        }
    }
    
}
