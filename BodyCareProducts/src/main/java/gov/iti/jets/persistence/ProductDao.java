package gov.iti.jets.persistence;

import java.util.List;

import gov.iti.jets.persistence.entities.Product;

public interface ProductDao {
    boolean insert (Product product);
    List <Product> load(int offset, int noOfRecords);
    List <Product> loadByCategory(String category, int offset, int noOfRecords);
    Long getNoOfRecords();
    

}
