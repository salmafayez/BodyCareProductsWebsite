package gov.iti.jets.services.util;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.AddProductService;
import gov.iti.jets.services.LoginService;
import gov.iti.jets.services.impl.AddProductServiceImpl;
import gov.iti.jets.services.impl.LoginServiceImpl;

public class DomainFacade {

    private static AddProductService addProductService = new AddProductServiceImpl();
    private static LoginService loginService = new LoginServiceImpl();
    

    public static boolean addProduct(Product product){
        return addProductService.addProduct(product);
    }

    public static User login(String email, String password){
        return loginService.login(email, password);
    }
    
}
