package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.persistence.entities.Product;

public interface AddProductService {
    public boolean addProduct(Product product);
    public List<Product> loadAllProducts(int offset, int noOfRecords);
    public List<Product> loadProductsByCategory(String category, int offset, int noOfRecords);
    public Long getNoOfRecords();
   
   
}
