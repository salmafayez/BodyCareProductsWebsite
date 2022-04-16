package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import gov.iti.jets.services.UserUpdateProfileService;

public class UserUpdateProfileServiceImpl implements UserUpdateProfileService {
    @Override
    public Boolean isUserUpdated(Integer userId, UpdatedUserDto updatedUserDto) {

        UserDao userDao =new UserDaoImpl();

        return userDao.updateUser(userId,updatedUserDto);
    }
}
