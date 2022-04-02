package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@MultipartConfig
public class LogoutControllerServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session !=null){
            session.invalidate();
        }
        Cookie[] cookies = request.getCookies();
        if(cookies != null)
        {
            for (int i=0; i<cookies.length; i++)
            {
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("AuthToken")){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
        response.sendRedirect("login");
    }    
}
