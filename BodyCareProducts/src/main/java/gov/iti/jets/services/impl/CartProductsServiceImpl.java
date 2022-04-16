package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.CartProductsDao;
import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.impl.CartProductsDaoImpl;
import gov.iti.jets.services.CartProductsService;

public class CartProductsServiceImpl implements CartProductsService {
    @Override
    public boolean addCartProduct(CartProducts cartProducts) {
        CartProductsDao cartProductsDao = new CartProductsDaoImpl();
        return cartProductsDao.addCartProduct(cartProducts);
    }

    @Override
    public boolean chechIfProductExist(Integer userId, Integer productId) {
        CartProductsDao cartProductsDao = new CartProductsDaoImpl();
        return cartProductsDao.chechIfProductExist(userId, productId);
    }

    @Override
    public boolean updateProduct(int productId, int userId, int quantity) {
        CartProductsDao cartProductsDao = new CartProductsDaoImpl();
        return cartProductsDao.updateProduct(productId, userId, quantity);
    }

    @Override
    public boolean addProductToCart(CartProducts cartProducts) {
        CartProductsDao cartProductsDao = new CartProductsDaoImpl();
        return cartProductsDao.addProductToCart(cartProducts);
    }
}
