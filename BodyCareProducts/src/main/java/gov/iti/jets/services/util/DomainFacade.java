package gov.iti.jets.services.util;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.AddProductService;
import gov.iti.jets.services.LoginService;
import gov.iti.jets.services.RegisterUserService;
import gov.iti.jets.services.impl.AddProductServiceImpl;
import gov.iti.jets.services.impl.LoginServiceImpl;
import jakarta.persistence.NoResultException;
import gov.iti.jets.services.impl.RegisterUserServiceImpl;

public class DomainFacade {

    private static final AddProductService addProductService = new AddProductServiceImpl();
    private static final RegisterUserService registerUserService = new RegisterUserServiceImpl();
    private static final LoginService loginService= new LoginServiceImpl();

    public static boolean addProduct(Product product){
        return addProductService.addProduct(product);
    }

    public static boolean checkEmail(String email) {
        return registerUserService.checkEmail(email);
    }

    public static User login(String email) throws NoResultException{
        return loginService.login(email);
    }

    public static boolean addUser(User user){return
                registerUserService.addUser(user);}
}
