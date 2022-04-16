package gov.iti.jets.presentation.requestdtomappers.requestdtomappersimpl;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import gov.iti.jets.presentation.requestdtomappers.RequestMapper;
import gov.iti.jets.presentation.util.HashManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class UpdateUserDtoMapper implements RequestMapper<UpdatedUserDto> {
    @Override
    public UpdatedUserDto map(HttpServletRequest request) throws IOException, ServletException {
        UpdatedUserDto updatedUserDto =new UpdatedUserDto();

        updatedUserDto.setUserName(request.getParameter("username"));
        updatedUserDto.setPhoneNumber(request.getParameter("phoneNumber"));
        updatedUserDto.setEmail(request.getParameter("email"));
        String password = request.getParameter("password");
        String userPassword = HashManager.INSTANCE.generateSecurePassword(password);
        updatedUserDto.setPassword(userPassword);
        updatedUserDto.setCountry(request.getParameter("country"));
        updatedUserDto.setCity(request.getParameter("city"));
        updatedUserDto.setDetailedAddress(request.getParameter("address"));
        updatedUserDto.setWallet(Double.parseDouble(request.getParameter("creditLimit")));


        return updatedUserDto;
    }
}
