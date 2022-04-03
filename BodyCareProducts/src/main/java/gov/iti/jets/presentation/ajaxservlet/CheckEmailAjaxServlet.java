package gov.iti.jets.presentation.ajaxservlet;

import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CheckEmailAjaxServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String email = request.getParameter("email");
        boolean result = DomainFacade.checkEmail(email);
        System.out.println("ajex" + result);
        response.getWriter().write(result+"");

    }

}