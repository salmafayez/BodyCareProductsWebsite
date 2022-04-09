package gov.iti.jets.services.impl;

import java.util.List;

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

    @Override
    public List<Product> loadAllProducts(int offset, int noOfRecords) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.load(offset, noOfRecords);
    }

    @Override
    public List<Product> loadProductsByCategory(String category, int offset, int noOfRecords) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.loadByCategory(category, offset, noOfRecords);
    }

    @Override
    public Long getNoOfRecords() {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.getNoOfRecords();
    }
}
