package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import jakarta.persistence.NoResultException;

public interface UserDao {
    boolean checkEmail (String email);
    boolean insert(User user);
    User login(String email) throws NoResultException;
    boolean updatePassword(String email , String password);
    User getUser(int id);

    boolean updateUser(Integer id , UpdatedUserDto updatedUserDto);
}
