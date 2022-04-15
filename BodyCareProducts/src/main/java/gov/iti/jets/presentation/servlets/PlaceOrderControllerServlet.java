package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PlaceOrderControllerServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session != null){
            String userAuth = (String) session.getAttribute("AuthToken");
            if(userAuth == null){
                session.setAttribute("previous-page", "place-order");
                response.sendRedirect("login");
            }else{
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("order.jsp");
                requestDispatcher.forward(request, response);
            }
        }
        
    } 
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
      
}
