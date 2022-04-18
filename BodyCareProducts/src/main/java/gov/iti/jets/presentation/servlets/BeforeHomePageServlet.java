package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.presentation.util.CookieHandler;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;


public class BeforeHomePageServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request.getCookies() != null){
            String authToken = CookieHandler.getCookie("AuthToken",request);
            if(authToken != null){
                HttpSession session = request.getSession();
                session.setAttribute("AuthToken",CookieHandler.getCookie("AuthToken",request));
                session.setAttribute("userId", Integer.parseInt(CookieHandler.getCookie("userId",request)));
                session.setAttribute("userName", CookieHandler.getCookie("userName",request));
            }
        }
        response.sendRedirect("home");
    }
}