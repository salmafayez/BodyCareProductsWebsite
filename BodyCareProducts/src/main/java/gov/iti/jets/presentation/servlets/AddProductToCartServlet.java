package gov.iti.jets.presentation.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddProductToCartServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session = request.getSession(false);
        String userid=(String)session.getAttribute("userId");

        PrintWriter out = response.getWriter();
        String productid = request.getParameter("productid");

        System.out.println("harara " + userid);

        System.out.println(productid);
        //System.out.println(id);


    }
}
