package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.persistence.entities.UserType;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDtoMapper implements RequestMapper<User> {

    List<String> interestsList =new ArrayList<>();
    @Override
    public User map(HttpServletRequest request) throws IOException, ServletException {
        User user = new User();
        user.setUserName(request.getParameter("username"));
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
        user.setBirthDate(LocalDate.parse(request.getParameter("birthday")));
        user.setJob(request.getParameter("job"));
        user.setCountry(request.getParameter("country"));
        user.setCity(request.getParameter("city"));
        user.setDetailedAddress(request.getParameter("address"));
        user.setWallet(Double.parseDouble(request.getParameter("creditLimit")));
        user.setUserType(UserType.CLIENT);

        Collections.addAll(interestsList, request.getParameterValues("interest"));
        user.setInterests(interestsList);
        return user;
    }
}
