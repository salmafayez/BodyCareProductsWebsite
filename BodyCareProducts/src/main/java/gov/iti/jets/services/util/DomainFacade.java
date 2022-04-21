package gov.iti.jets.services.util;

import java.util.List;

import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import gov.iti.jets.persistence.entities.*;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.presentation.dtos.OrderDto;
import gov.iti.jets.presentation.dtos.UpdatedUserDto;
import gov.iti.jets.services.*;
import gov.iti.jets.services.impl.*;
import jakarta.persistence.NoResultException;
import gov.iti.jets.services.impl.RegisterUserServiceImpl;

public class DomainFacade {

    private static final ProductService addProductService = new ProductServiceImpl();
    private static final RegisterUserService registerUserService = new RegisterUserServiceImpl();
    private static final LoginService loginService = new LoginServiceImpl();
    private static final UpdatePasswordService updatePasswordService = new UpdatePasswordServiceImpl();
    private static final CategoryService categoryService = new CategoryServiceImpl();
    private static final ContactMessageService contactMessageService = new ContactMessageServiceImpl();
    private static final UsersHistoryService usersHistoryService = new UsersHistroyServiceImpl();
    private static final CartProductsService cartProductsService = new CartProductsServiceImpl();
    private static final OrderService orderService = new OrderServiceImpl();
    private static final UserUpdateProfileService userUpdateProfileService = new UserUpdateProfileServiceImpl();
    private static final PaymentService paymentService = new PaymentServiceImpl();
    private static final WishListService wishListService = new WishListServiceImpl();


    public static boolean addProduct(Product product) {
        Category category = categoryService.getcategory(product.getCategoryName());
        product.setCategory(category);
        return addProductService.addProduct(product);
    }

    public static boolean checkEmail(String email) {
        return registerUserService.checkEmail(email);
    }

    public static User login(String email) throws NoResultException {
        return loginService.login(email);
    }

    public static boolean updatePassword(String email, String password) {
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

    public static List<Product> loadAllProducts(int offset, int noOfRecords) {
        return addProductService.loadAllProducts(offset, noOfRecords);
    }

    public static List<Product> loadProductsByCategory(String category, int offset, int noOfRecords) {
        return addProductService.loadProductsByCategory(category, offset, noOfRecords);
    }

    public static List<User> loadAllUses() {
        return usersHistoryService.loadAllUsers();
    }

    public static List<ContactMessage> loadAllMessages() {
        return contactMessageService.loadAllMessages();
    }


    public static Product getProductById(int id) {
        return addProductService.getProductById(id);
    }

    public static User getUser(int id) {
        return registerUserService.getUser(id);
    }

    public static boolean chechIfProductExist(Integer userId, Integer productId) {
        return cartProductsService.chechIfProductExist(userId, productId);
    }

    public static boolean updateProduct(int productId, int userId, int quantity) {
        return cartProductsService.updateProduct(productId, userId, productId);
    }

    public static boolean addProductToCart(CartProducts cartProducts) {
        return cartProductsService.addProductToCart(cartProducts);
    }

    public static Long getNoOfRecords() {
        return addProductService.getNoOfRecords();
    }

    public static boolean addUser(User user) {
        return registerUserService.addUser(user);
    }

    public static boolean updateUser(Integer id, UpdatedUserDto updatedUserDto) {
        return userUpdateProfileService.isUserUpdated(id, updatedUserDto);
    }

    public static Product getProduct(int id) {
        return addProductService.getProduct(id);
    }


    public static List<Product> searchByPrice(double max, double min, int offset, int noOfRecords){
        return addProductService.searchByPrice(max, min,offset,noOfRecords);
    }

 
    public static List<Product> searchProducts(String searchProduct, int offset, int noOfRecords) {
        return addProductService.searchProducts(searchProduct, offset, noOfRecords);
    }

    public static boolean removeProduct(int id) {
        return addProductService.removeProduct(id);
    }

    public static boolean editProduct(Product product) {
        return addProductService.editProduct(product);
    }

    public static String authorizePayment(OrderDto orderDto) throws PayPalRESTException {
        return paymentService.authorizePayment(orderDto);
    }

    public static Payment getPaymentDetails(String id) throws PayPalRESTException {
        return paymentService.getPaymentDetails(id);
    }

    public static Payment executePayment(String paymentId, String payerId) throws PayPalRESTException {
        return paymentService.executePayment(paymentId, payerId);
    }


    public static List<Order> getAllOrders() {
        return orderService.getAllOrders();

    }

    public static List<Order> getOrderByUserId(int id) {
        return orderService.getOrderByUserId(id);
    }

    public static void saveOrder(Order order) {
        orderService.saveOrder(order);
    }

    public static void saveWishList(Wishlist wishlist) {
        wishListService.saveWishList(wishlist);
    }

    public static double getMax(){
        return addProductService.getMax();
    }
    public static double getMin(){
        return addProductService.getMin();
    }

    public static List<CartItemDto> getCart(int id) {
        return cartProductsService.getCartList(id);
    }

    public static List<Wishlist> getWishList(int id) {
        return wishListService.getWishListList(id);
    }

    public static List<Product> getAllProducts() {
        return addProductService.getAllProducts();
    }
    public static List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

}

