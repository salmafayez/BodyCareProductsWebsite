package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import com.paypal.base.rest.PayPalRESTException;

import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.OrderDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PlaceOrderControllerServlet extends HttpServlet {

    private static final RequestMapper<Order> orderMapper= new OrderDtoMapper();
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session != null){
            String userAuth = (String) session.getAttribute("AuthToken");
            if(userAuth == null){
                session.setAttribute("previous-page", "place-order");
                response.sendRedirect("login");
            }else{
                try {
                    System.out.println("1");
                    Order order = orderMapper.map(request);
                    String approvalLink;
                    System.out.println("2");
                    approvalLink = DomainFacade.authorizePayment(order);
                    System.out.println("3");
                    response.sendRedirect(approvalLink);
                    System.out.println("4");
                } catch (PayPalRESTException e) {
                    e.printStackTrace();
                }  
                
                //catch (PayPalRESTException ex) {
                //     request.setAttribute("errorMessage", ex.getMessage());
                //     ex.printStackTrace();
                //     request.getRequestDispatcher("error.jsp").forward(request, response);
                //}
            }
        }
        
    } 
    
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    request.getRequestDispatcher("order.jsp").forward(request,response);
     }
      
}
