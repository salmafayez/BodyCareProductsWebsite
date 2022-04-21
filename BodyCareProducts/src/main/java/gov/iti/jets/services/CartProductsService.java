package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.presentation.dtos.CartItemDto;

import java.util.List;

public interface CartProductsService {
    boolean addCartProduct(CartProducts cartProducts);
    boolean chechIfProductExist(Integer userId, Integer productId);
    boolean updateProduct(int productId, int userId, int quantity);
    boolean addProductToCart(CartProducts cartProducts);
    List<CartItemDto> getCartList (int id);
}
