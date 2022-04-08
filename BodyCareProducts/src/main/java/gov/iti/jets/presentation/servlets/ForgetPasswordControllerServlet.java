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
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@MultipartConfig
public class ForgetPasswordControllerServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       String email = request.getParameter("email");
        String to = email;
        
       int otp = 0;
       RequestDispatcher requestDispatcher = null;
       HttpSession mySession = request.getSession();
       if(email!=null){
           Random rand = new Random();
           otp = rand.nextInt(1288223);
           Properties props = new Properties();
           props.put("mail.smtp.host","smtp.gmail.com");
           props.put("mail.smtp.socketFactory.port", "465");
           props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.auth","true");
           props.put("mail.smtp.port","465");
           Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication("sondoss.salahh@gmail.com","rpuqnxlkiescyzhw");
               }
           });

           try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));// change accordingly
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Verify your email address");
            message.setText("To verify your email address use this secuirty code: " + otp);
            // send message
            Transport.send(message);
            System.out.println("message sent successfully");
            request.setAttribute("message","OTP is sent to your email id");
            mySession.setAttribute("otp",otp); 
            mySession.setAttribute("email",email);  
            requestDispatcher = request.getRequestDispatcher("enter-otp.jsp");
            requestDispatcher.forward(request, response);
                
        }

        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
         
        // request.setAttribute("status", "success");
    
       }
    }    
}
