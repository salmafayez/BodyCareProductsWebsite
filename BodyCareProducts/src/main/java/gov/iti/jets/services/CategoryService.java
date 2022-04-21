package gov.iti.jets.services;

import java.util.List;

import gov.iti.jets.persistence.entities.Category;

public interface CategoryService {
    boolean addCategory(Category category);
    Category getcategory (String categoryName);
    List<Category> getCategoryList();
    public List<Category> getAllCategories();

    }
