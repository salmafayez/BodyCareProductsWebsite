package gov.iti.jets.presentation.util;

import gov.iti.jets.persistence.entities.User;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.util.Random;


public class SendEmail {
    HtmlEmail htmlEmail ;

    public SendEmail() {
    }

    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    //send email to the user email
    public boolean sendEmail(User user) {
        boolean test = false;

        String toEmail = user.getEmail();
        String fromEmail = "chatty373@gmail.com";
        String password = "chattychatty373";

        System.out.println("Send Email: " + user.getEmail());

        try {
            htmlEmail = new HtmlEmail();
            htmlEmail.setHostName("smtp.googlemail.com");
            htmlEmail.setSmtpPort(465);
            htmlEmail.setAuthenticator(new DefaultAuthenticator(fromEmail,
                    password));
            htmlEmail.setSSLOnConnect(true);

            try {
                htmlEmail.setFrom(fromEmail);
                htmlEmail.setSubject("Bath & Body");
                htmlEmail.addTo(toEmail);
                htmlEmail.setHtmlMsg("<html>" +
                        "<h1>Welcome to our skincare Application  </h1> <br>"+
                        "<h2>Here is your confirmation Code:  " +user.getCode()+ "</h2> " +
                        "</html>");
                htmlEmail.send();
                test=true;
            } catch (EmailException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
    }

}