package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.UserDao;
import gov.iti.jets.persistence.impl.UserDaoImpl;
import gov.iti.jets.services.UpdatePasswordService;

public class UpdatePasswordServiceImpl implements UpdatePasswordService{
    @Override
    public boolean updatePassword (String email , String password){
        UserDao userDao = new UserDaoImpl();
        return userDao.updatePassword(email , password);
   
}
}