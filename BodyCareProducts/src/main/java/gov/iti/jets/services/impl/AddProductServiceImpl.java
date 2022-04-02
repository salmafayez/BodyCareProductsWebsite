package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.CategoryDao;
import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.impl.CategoryDaoImpl;
import gov.iti.jets.persistence.impl.ProductDaoImpl;
import gov.iti.jets.services.AddProductService;

public class AddProductServiceImpl implements AddProductService {


    @Override
    public boolean addProduct(Product product) {
        CategoryDao categoryDao = new CategoryDaoImpl();
        ProductDao productDao = new ProductDaoImpl();
        Category category = categoryDao.getCategory("salma");
        product.setCategory(category);
        return productDao.insert(product);
        
    }
}
