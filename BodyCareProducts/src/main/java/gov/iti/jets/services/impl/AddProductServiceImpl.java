package gov.iti.jets.services.impl;

import jakarta.persistence.*;
import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.impl.ProductDaoImpl;
import gov.iti.jets.persistence.util.EntityFactory;
import gov.iti.jets.services.AddProductService;

public class AddProductServiceImpl implements AddProductService {

    @Override
    public boolean addProduct(Product product) {
        EntityManager entityManager = EntityFactory.getEntityManager();
        ProductDao productDao = new ProductDaoImpl(entityManager);
        return productDao.insert(product);
        
    }
}
