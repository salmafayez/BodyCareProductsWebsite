package gov.iti.jets.services;

import gov.iti.jets.presentation.dtos.UpdatedUserDto;

public interface UserUpdateProfileService {

    Boolean isUserUpdated(Integer userId, UpdatedUserDto updatedUserDto);
}
