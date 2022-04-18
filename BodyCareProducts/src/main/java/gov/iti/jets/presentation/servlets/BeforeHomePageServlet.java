package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.presentation.util.CookieHandler;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


public class BeforeHomePageServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("before before");
        if(request.getCookies() != null){
            System.out.println("before");
            String authToken = CookieHandler.getCookie("AuthToken",request);
            if(authToken != null){
                System.out.println("after");
                HttpSession session = request.getSession();
                session.setAttribute("AuthToken",CookieHandler.getCookie("AuthToken",request));
                session.setAttribute("userId", Integer.parseInt(CookieHandler.getCookie("userId",request)));
                session.setAttribute("userName", CookieHandler.getCookie("userName",request));
            }
        }
        response.sendRedirect("home");
    }
}