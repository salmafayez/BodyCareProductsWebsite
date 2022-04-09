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
public class ValidateOtpControllerServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int value=Integer.parseInt(request.getParameter("otp"));
		HttpSession session=request.getSession();
		int otp=(int)session.getAttribute("otp");
		
		RequestDispatcher dispatcher=null;
			
		if (value==otp) 
		{
			
				request.setAttribute("email", request.getParameter("email"));
				request.setAttribute("status", "success");
			  dispatcher=request.getRequestDispatcher("new-password.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			request.setAttribute("message","wrong otp");
		   dispatcher=request.getRequestDispatcher("enter-otp.jsp");
			dispatcher.forward(request, response);
		
		}
		
	}
       
    }
