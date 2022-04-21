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

    @Override
    public List<Product> searchProducts(String searchProduct, int offset, int noOfRecords) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.searchProducts(searchProduct, offset, noOfRecords);
    }

    @Override
    public Product getProductById(int id) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.getProductById(id);
    }

    @Override
    public Product getProduct(int id) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.getProduct(id);
    }

    @Override
    public boolean removeProduct(int id) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.removeProduct(id);
    }

    @Override
    public boolean editProduct(Product product) {
        ProductDao productDao = new ProductDaoImpl();
        return productDao.editProduct(product);
    }
    public List<Product> getAllProducts(){
        ProductDao productDao = new ProductDaoImpl();
        return productDao.getAllProducts();
    }
}
