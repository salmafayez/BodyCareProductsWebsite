package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.CartProductsDao;
import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.impl.CartProductsDaoImpl;
import gov.iti.jets.presentation.dtos.CartItemDto;
import gov.iti.jets.services.CartProductsService;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CartItemDto> getCartList(int id) {
        CartProductsDao cartProductsDao = new CartProductsDaoImpl();
        List<CartProducts> list = cartProductsDao.getCartProductsList(id);
        List<CartItemDto> cartItemDtos = new ArrayList<>();
        list.forEach(cartProducts -> {
            CartItemDto cartItemDto = new CartItemDto();
            cartItemDto.setProduct(cartProducts.getProduct());
            cartItemDto.setQuantity(cartProducts.getQuantity());
            cartItemDtos.add(cartItemDto);
        });
        return cartItemDtos;
    }
}
