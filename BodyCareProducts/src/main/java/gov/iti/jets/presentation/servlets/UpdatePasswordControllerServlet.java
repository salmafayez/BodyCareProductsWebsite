package gov.iti.jets.presentation.servlets;
import java.io.IOException;
import gov.iti.jets.presentation.util.HashManager;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdatePasswordControllerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.getRequestDispatcher("new-password.jsp").forward(request,response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		HttpSession session = request.getSession();
		String newPassword = request.getParameter("password");
		String confPassword = request.getParameter("confPassword");
		String email =(String) session.getAttribute("email");

		if (newPassword != null && confPassword != null && newPassword.equals(confPassword)) {
			try {
				String userPassword = HashManager.INSTANCE.generateSecurePassword(newPassword);
				boolean updatePassword = DomainFacade.updatePassword(email,userPassword);
				if(updatePassword){
					response.sendRedirect("login");
				}
				else{
					request.setAttribute("status", "resetFailed");
					request.getRequestDispatcher("new-password.jsp").forward(request,response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

