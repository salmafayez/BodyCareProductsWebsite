package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.CartProducts;

public interface CartProductsDao {
    public boolean addCartProduct(CartProducts cartProducts);
    boolean chechIfProductExist(Integer userId, Integer productId);
    boolean updateProduct(int productId, int userId, int quantity);
    boolean addProductToCart(CartProducts cartProducts);
}
