package gov.iti.jets.persistence;

import java.util.List;
import gov.iti.jets.persistence.entities.Category;

public interface CategoryDao {
    List<Category> getAll ();
    boolean insert(Category category);
    Category getCategory(String categoryName);
}
