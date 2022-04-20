package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.time.LocalDate;
//import com.paypal.api.payments.*;
import gov.iti.jets.persistence.entities.LineItem;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.OrderDto;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class ExecutePaymentControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String paymentId = request.getParameter("paymentId");
//        String payerId = request.getParameter("PayerID");
        HttpSession session= request.getSession();
        int userId= (Integer)session.getAttribute("userId");
        System.out.println(userId);
        User user= DomainFacade.getUser(userId);

        Order order = new Order();
        OrderDto orderDto = (OrderDto) session.getAttribute("order");
        order.setOrderTime(orderDto.getOrderTime());
        order.setUser(user);
        orderDto.getLineItemList().forEach(
                lineItem ->{
                    LineItem item = new LineItem();
                    item.setOrder(order);
                    item.setProductName(lineItem.getProductName());
                    item.setProductPrice(lineItem.getProductPrice());
                    item.setProductQuantity(lineItem.getProductQuantity());
                    order.getLineItemList().add(item);
                }
        );

        double totalPrice = orderDto.getLineItemList().stream()
                            .map(item -> item.getProductPrice()*item.getProductQuantity())
                            .reduce(0.0, (a, b) -> a + b);
        order.setTotalPrice(totalPrice);
        DomainFacade.saveOrder(order);
        request.getRequestDispatcher("receipt.jsp").forward(request, response);

//        try {
//            Payment payment = DomainFacade.executePayment(paymentId, payerId);
//            PayerInfo payerInfo = payment.getPayer().getPayerInfo();
//            Transaction transaction = payment.getTransactions().get(0);
//
//            request.getRequestDispatcher("receipt.jsp").forward(request, response);
//
//        } catch (PayPalRESTException ex) {
//            request.setAttribute("errorMessage", ex.getMessage());
//            request.getRequestDispatcher("error.jsp").forward(request, response);
//        }
    }

}