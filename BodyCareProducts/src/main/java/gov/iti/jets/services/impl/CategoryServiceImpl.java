package gov.iti.jets.services.impl;

import java.util.List;

import gov.iti.jets.persistence.CategoryDao;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.impl.CategoryDaoImpl;
import gov.iti.jets.services.CategoryService;

public class CategoryServiceImpl implements CategoryService{

    @Override
    public boolean addCategory(Category category) {
        CategoryDao categoryDao = new CategoryDaoImpl();
        return categoryDao.insert(category);
    }

    @Override
    public Category getcategory(String categoryName) {
        CategoryDao categoryDao = new CategoryDaoImpl();
        return categoryDao.getCategory(categoryName);
    }

    @Override
    public List<Category> getCategoryList() {
        CategoryDao categoryDao = new CategoryDaoImpl();
        return categoryDao.getAll();
    }

    @Override
    public List<Category> getAllCategories() {
        CategoryDao categoryDao = new CategoryDaoImpl();
        return categoryDao.getAllCategories();
    }


}
