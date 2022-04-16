package gov.iti.jets.services;

import java.util.List;

import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.PayPalRESTException;

import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.OrderDto;

public interface PaymentService {

    String authorizePayment(OrderDto orderDto) throws PayPalRESTException;
    Payer getPayerInformation(User user);
    RedirectUrls getRedirectURLs();
    List<Transaction> getTransactionInformation(OrderDto orderDto);
    String getApprovalLink(Payment approvedPayment);
    Payment getPaymentDetails(String paymentId) throws PayPalRESTException;
    Payment executePayment(String paymentId, String payerId)throws PayPalRESTException ;
    
}
