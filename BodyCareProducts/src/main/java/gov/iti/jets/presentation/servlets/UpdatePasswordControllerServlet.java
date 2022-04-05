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

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.util.HashManager;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdatePasswordControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		HttpSession session = request.getSession();
		String newPassword = request.getParameter("password");
		String confPassword = request.getParameter("confPassword");
		String email =(String) session.getAttribute("email");
		RequestDispatcher dispatcher = null;
		if (newPassword != null && confPassword != null && newPassword.equals(confPassword)) {

			try {
				String userPassword = HashManager.INSTANCE.generateSecurePassword(newPassword);
				boolean updatePassword = DomainFacade.updatePassword(email,userPassword);
				if(updatePassword){
					request.setAttribute("status", "resetSuccess");
					dispatcher = request.getRequestDispatcher("login.jsp");
				}
				else{
					request.setAttribute("status", "resetFailed");
					dispatcher = request.getRequestDispatcher("new-password.jsp");
				}
				dispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

		//827ccb0eea8a706c4c34a16891f84e7b	
