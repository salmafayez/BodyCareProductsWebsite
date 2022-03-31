package gov.iti.jets.services.util;

import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.services.AddProductService;
import gov.iti.jets.services.impl.AddProductServiceImpl;

public class DomainFacade {

    private static AddProductService addProductService = new AddProductServiceImpl();

    public static boolean addProduct(Product product){
        return addProductService.addProduct(product);
    }
    
}
