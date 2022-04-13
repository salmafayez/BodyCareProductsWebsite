package gov.iti.jets.services.util;

import java.util.List;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Category;
import gov.iti.jets.persistence.entities.ContactMessage;
import gov.iti.jets.persistence.entities.Product;
import gov.iti.jets.persistence.entities.User;
import gov.iti.jets.services.*;
import gov.iti.jets.services.impl.*;
import jakarta.persistence.NoResultException;

public class DomainFacade {

    private static final ProductService addProductService = new ProductServiceImpl();
    private static final RegisterUserService registerUserService = new RegisterUserServiceImpl();
    private static final LoginService loginService= new LoginServiceImpl();
    private static final UpdatePasswordService updatePasswordService= new UpdatePasswordServiceImpl();
    private static final CategoryService categoryService = new CategoryServiceImpl();
    private static final ContactMessageService contactMessageService = new ContactMessageServiceImpl();
    private static final UsersHistoryService usersHistoryService = new UsersHistroyServiceImpl();
    private static final CartProductsService cartProductsService = new CartProductsServiceImpl();

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

    public static boolean updatePassword(String email , String password){
        return updatePasswordService.updatePassword(email, password);
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

    public static List<User> loadAllUses(){
        return usersHistoryService.loadAllUsers();
    }
    public static List<ContactMessage> loadAllMessages(){
        return contactMessageService.loadAllMessages();
    }


    public static Product getProductById(int id){
        return addProductService.getProductById(id);
    }

    public static User getUser(int id){
        return registerUserService.getUser(id);
    }

    public static boolean chechIfProductExist(Integer userId, Integer productId){
        return cartProductsService.chechIfProductExist(userId, productId);
    }

    public static boolean updateProduct(int productId, int userId, int quantity){
        return cartProductsService.updateProduct(productId,userId, productId);
    }

    public static boolean addProductToCart(CartProducts cartProducts){
        return cartProductsService.addProductToCart(cartProducts);
    }

    public static List<Product> loadProductsByCategory(String category){
        return addProductService.loadProductsByCategory(category);
    }

    public static boolean addUser(User user) {
        return registerUserService.addUser(user);
    }

}
