package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.persistence.entities.Product;

public interface ProductService {
    public boolean addProduct(Product product);
    public Product getProductById(int id);
    public Product getProduct(int id);
    public List<Product> loadAllProducts(int offset, int noOfRecords);
    public List<Product> loadProductsByCategory(String category, int offset, int noOfRecords);
    public Long getNoOfRecords();
    public List<Product> searchProducts(String searchProduct, int offset, int noOfRecords);
}
