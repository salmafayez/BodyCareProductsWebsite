package gov.iti.jets.presentation.servlets;

import java.io.IOException;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.ProductDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.UserDtoMapper;
import gov.iti.jets.presentation.util.SendEmail;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import static java.lang.System.out;



public class RegisterUserControllerServlet extends HttpServlet {

   private static final RequestMapper<User> userMapper= new UserDtoMapper();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("inside get");
        HttpSession session = request.getSession(false);
        if(session!=null){
            System.out.println("inside get 0000");
            if ((String) session.getAttribute("AuthToken") == null){
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
                requestDispatcher.forward(request, response);
            }else{
                response.sendRedirect("index.jsp");
            }
        }else{
            System.out.println("inside get 1111 ");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
            requestDispatcher.forward(request, response);
        }

    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //System.out.println("inside post");
        SendEmail sm = new SendEmail();
       // System.out.println("1");
        String code = sm.getRandom();
        request.setAttribute("code", code);
       // System.out.println("2");
        User user=userMapper.map(request);
       // System.out.println("3");
        boolean test = sm.sendEmail(user);
       // System.out.println("4");
        if(test){
            HttpSession session  = request.getSession();
            session.setAttribute("authcode", user.getCode());
            session.setAttribute("user", user);
            System.out.println("5");
            response.sendRedirect("verify.jsp");
        }else{
            out.println("Failed to send verification email");
            System.out.println("6");
        }

    }

}