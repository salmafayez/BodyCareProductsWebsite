package gov.iti.jets.services.util;

import java.util.List;

import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.*;
import gov.iti.jets.services.impl.*;
import jakarta.persistence.NoResultException;

public class DomainFacade {

    private static final AddProductService addProductService = new AddProductServiceImpl();
    private static final RegisterUserService registerUserService = new RegisterUserServiceImpl();
    private static final LoginService loginService= new LoginServiceImpl();
    private static final CategoryService categoryService = new CategoryServiceImpl();
    private static final ContactMessageService contactMessageService = new ContactMessageServiceImpl();

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
    public static boolean addContactMessage(ContactMessage contactMessage) {
        return contactMessageService.addContactMessage(contactMessage);
    }

    public static List<Category> loadCategories() {
        return categoryService.getCategoryList();
    }
    
    public static List<Product> loadAllProducts(){
        return addProductService.loadAllProducts();
    }

    public static List<Product> loadProductsByCategory(String category){
        return addProductService.loadProductsByCategory(category);
    }

}
