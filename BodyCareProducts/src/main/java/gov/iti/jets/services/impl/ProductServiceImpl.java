package gov.iti.jets.services.impl;

import java.util.List;

import gov.iti.jets.persistence.ProductDao;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.impl.ProductDaoImpl;
import gov.iti.jets.services.ProductService;

public class ProductServiceImpl implements ProductService {


    @Override
    public boolean addProduct(Product product) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.insert(product);  
    }

    @Override
    public List<Product> loadAllProducts() {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.load();
    }

    @Override
    public List<Product> loadProductsByCategory(String category) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.loadByCategory(category);
    }

    @Override
    public Product getProductById(int id) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.getProductById(id);
    }
}
