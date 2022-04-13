package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Product;

public interface CartProductsService {
    public boolean addCartProduct(CartProducts cartProducts);

    boolean chechIfProductExist(Integer userId, Integer productId);
    boolean updateProduct(int productId, int userId, int quantity);
    boolean addProductToCart(CartProducts cartProducts);

}
