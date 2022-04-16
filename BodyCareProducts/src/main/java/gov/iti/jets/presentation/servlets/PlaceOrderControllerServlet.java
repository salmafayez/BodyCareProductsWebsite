package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import com.paypal.base.rest.PayPalRESTException;
import gov.iti.jets.presentation.dtos.OrderDto;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.OrderDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class PlaceOrderControllerServlet extends HttpServlet {

    private static final RequestMapper<OrderDto> orderMapper= new OrderDtoMapper();
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        if(session != null){
            if((String) session.getAttribute("AuthToken") == null){
                session.setAttribute("previous-page", "place-order");
                response.sendRedirect("login");
            }else {
                try {
                    OrderDto orderDto = orderMapper.map(request);
                    String approvalLink = DomainFacade.authorizePayment(orderDto);
                    response.sendRedirect(approvalLink);
                } catch (PayPalRESTException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    request.getRequestDispatcher("order.jsp").forward(request,response);
     }
      
}
