package gov.iti.jets.persistence;

import java.util.List;

import gov.iti.jets.persistence.entities.Product;

public interface ProductDao {
    boolean insert (Product product);
    List <Product> load();
}
