package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.persistence.entities.Product;

public interface ProductService {
    public boolean addProduct(Product product);
    public List<Product> loadAllProducts();
    public List<Product> loadProductsByCategory(String category);
    public Product getProductById(int id);
   
   
}
