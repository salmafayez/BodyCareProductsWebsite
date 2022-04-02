package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.impl.ProductDaoImpl;
import gov.iti.jets.services.AddProductService;

public class AddProductServiceImpl implements AddProductService {

    @Override
    public boolean addProduct(Product product) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.insert(product);
        
    }
}
