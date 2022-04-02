package gov.iti.jets.services.util;

import java.util.List;

import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.AddProductService;
import gov.iti.jets.services.CategoryService;
import gov.iti.jets.services.LoginService;
import gov.iti.jets.services.RegisterUserService;
import gov.iti.jets.services.impl.AddProductServiceImpl;
import gov.iti.jets.services.impl.CategoryServiceImpl;
import gov.iti.jets.services.impl.LoginServiceImpl;
import jakarta.persistence.NoResultException;
import gov.iti.jets.services.impl.RegisterUserServiceImpl;

public class DomainFacade {

    private static final AddProductService addProductService = new AddProductServiceImpl();
    private static final RegisterUserService registerUserService = new RegisterUserServiceImpl();
    private static final LoginService loginService= new LoginServiceImpl();
    private static final CategoryService categoryService = new CategoryServiceImpl();

    public static boolean addProduct(Product product){
        Category category = categoryService.getcategory(product.getCategoryName());
        product.setCategory(category);
        return addProductService.addProduct(product);
    }

    public static boolean checkEmail(String email) {
        return registerUserService.checkEmail(email);
    }

    public static User login(String email) throws NoResultException{
        return loginService.login(email);
    }

    public static boolean addUser(User user){
        return registerUserService.addUser(user);
    }

    public static boolean addCategory(Category category) {
        return categoryService.addCategory(category);
    }

    public static List<Category> loadCategories() {
        return categoryService.getCategoryList();
    }

}
