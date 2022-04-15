package gov.iti.jets.presentation.servlets;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.UpdateUserDtoMapper;
import gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl.UserDtoMapper;
import gov.iti.jets.services.util.DomainFacade;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.UUID;

public class UserUpdateProfileServlet extends HttpServlet {

    private static final RequestMapper<UpdatedUserDto> updateUserDtoMapper= new UpdateUserDtoMapper();
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HttpSession session= request.getSession();
        Integer userId= (Integer) session.getAttribute("userId");
        User user= DomainFacade.getUser(userId);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user-update-profile.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session= request.getSession();
        Integer userId= (Integer) session.getAttribute("userId");



        UpdatedUserDto updatedUserDto=updateUserDtoMapper.map(request);
        Boolean isUserUpdated=DomainFacade.updateUser(userId,updatedUserDto);
        if(isUserUpdated){
            User user= DomainFacade.getUser(userId);
            UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();
            request.getSession().setAttribute("AuthToken", randomUUIDString);
            request.getSession().setAttribute("userId", user.getId());
            request.getSession().setAttribute("userName", user.getUserName());

            // now create a new cookie with this UUID value
            Cookie newCookie = new Cookie("AuthToken", randomUUIDString);
            response.addCookie(newCookie);

            request.setAttribute("user", user);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user-profile.jsp");
            requestDispatcher.forward(request, response);
        }



    }
}
