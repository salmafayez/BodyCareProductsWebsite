package gov.iti.jets.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.paypal.api.payments.*;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import gov.iti.jets.persistence.entities.Order;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.PaymentService;

public class PaymentServiceImpl implements PaymentService{

    private static final String CLIENT_ID = "Ad_hWBTNGb90Yg5JtqYrkpxEJ-KGQnwUPTIBS3iWZ3Vsrt0nQXFQf8Kb4Zdw05YIJL8ydqto6Yhruur8";
    private static final String CLIENT_SECRET = "EHyBntmGZ96Y658tcEXaE6e3opqj4qYXGMEp8aFwQUBZDTmcgg4B9fB1i817Y272jG0nclFP5rNbHMU4";
    private static final String MODE = "sandbox";

    @Override
    public String authorizePayment(Order order) throws PayPalRESTException {

        Payer payer = getPayerInformation(order.getUser());
        RedirectUrls redirectUrls = getRedirectURLs();
        List<Transaction> listTransaction = getTransactionInformation(order);
        Payment requestPayment = new Payment();
        requestPayment.setTransactions(listTransaction);
        requestPayment.setRedirectUrls(redirectUrls);
        requestPayment.setPayer(payer);
        requestPayment.setIntent("authorize");
 
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);
 
        Payment approvedPayment = requestPayment.create(apiContext);
 
        return getApprovalLink(approvedPayment);
    }

    @Override
    public String getApprovalLink(Payment approvedPayment) {
        List<Links> links = approvedPayment.getLinks();
        String approvalLink = null;
        
        for (Links link : links) {
            if (link.getRel().equalsIgnoreCase("approval_url")) {
                approvalLink = link.getHref();
                break;
            }
        }      
        return approvalLink;
    }

    @Override
    public Payer getPayerInformation(User user) {
        Payer payer = new Payer();
        payer.setPaymentMethod("paypal");
        PayerInfo payerInfo = new PayerInfo();
        payerInfo.setFirstName(user.getUserName())
                    .setEmail("william.peterson@company.com");
     
        payer.setPayerInfo(payerInfo);
        return payer;
    }

    @Override
    public RedirectUrls getRedirectURLs() {
        RedirectUrls redirectUrls = new RedirectUrls();
        redirectUrls.setCancelUrl("http://localhost:9797/skincareapp/home");
        redirectUrls.setReturnUrl("http://localhost:9797/skincareapp/review-payment");
        return redirectUrls;
    }

    @Override
    public List<Transaction> getTransactionInformation(Order order) {
        Details details = new Details();
        details.setShipping("0");
        details.setSubtotal("1");
        details.setTax("0");

        Amount amount = new Amount();
        amount.setCurrency("USD");
        amount.setTotal("1");
        amount.setDetails(details);

        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setDescription("salma");

        ItemList itemList = new ItemList();
        List<Item> items = new ArrayList<>();

        Item item = new Item();
        item.setCurrency("USD");
        item.setName("salma fayez");
        item.setPrice("1");
        item.setTax("0");
        item.setQuantity("1");

        items.add(item);
        itemList.setItems(items);
        transaction.setItemList(itemList);

        List<Transaction> listTransaction = new ArrayList<>();
        listTransaction.add(transaction);

        return listTransaction;
    }

    public Payment getPaymentDetails(String paymentId) throws PayPalRESTException {
        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);
        return Payment.get(apiContext, paymentId);
    }

    public Payment executePayment(String paymentId, String payerId)
            throws PayPalRESTException {
        System.out.println("paymentId" + paymentId);
        System.out.println("payerId" + payerId);
        PaymentExecution paymentExecution = new PaymentExecution();
        paymentExecution.setPayerId(payerId);

        Payment payment = new Payment().setId(paymentId);

        APIContext apiContext = new APIContext(CLIENT_ID, CLIENT_SECRET, MODE);

        return payment.execute(apiContext, paymentExecution);
    }
    
}
