package gov.iti.jets.persistence;

import java.util.List;
import gov.iti.jets.persistence.entities.Product;

public interface ProductDao {
    boolean insert (Product product);
    public Product getProductById(int id);
    Product getProduct(int id);
    List <Product> load(int offset, int noOfRecords);
    List <Product> loadByCategory(String category, int offset, int noOfRecords);
    List <Product> searchProducts(String searchProduct, int offset, int noOfRecords);
    Long getNoOfRecords();
    List <Product> getProductByPrice(double max , double min,  int offset, int noOfRecords);
    double getMax();
    double getMin();
    boolean removeProduct(int id);
    boolean editProduct(Product product);
    public List<Product> getAllProducts();

}
