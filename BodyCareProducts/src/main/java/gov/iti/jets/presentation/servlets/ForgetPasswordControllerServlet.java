package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import gov.iti.jets.presentation.util.SendEmailForForgetPassword;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@MultipartConfig
public class ForgetPasswordControllerServlet extends HttpServlet{

    SendEmailForForgetPassword emailService = new SendEmailForForgetPassword();
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("forgetpassword.jsp").forward(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       String email = request.getParameter("email");

       int otp = 0;
       HttpSession mySession = request.getSession();
       if(email!=null){
           Random rand = new Random();
           otp = rand.nextInt(1288223);
           Properties props = emailService.getProperties();
           Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication("sondoss.salahh@gmail.com","rpuqnxlkiescyzhw");
               }
           });

           try {
           Message message = emailService.createMessage(session,email,otp);
            Transport.send(message);
            System.out.println("message sent successfully");
            request.setAttribute("message","OTP is sent to your email id");
            mySession.setAttribute("otp",otp);
            mySession.setAttribute("email",email);
            response.sendRedirect("validateotp");
                
        }

        catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        // request.setAttribute("status", "success");

       }
    }    
}
