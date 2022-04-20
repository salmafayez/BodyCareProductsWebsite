package gov.iti.jets.persistence.impl;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Wishlist;

import java.util.List;

public class Test {
    public static void main(String [] args){
        WishListDaoImpl wishListDao = new WishListDaoImpl();
//        List<Wishlist> list = wishListDao.getCartProductsList(9);
//        System.out.println(list.size());

        CartProductsDaoImpl cartProductsDao = new CartProductsDaoImpl();
        List<CartProducts> list2 = cartProductsDao.getCartProductsList(9);
        System.out.println(list2.size());
    }
}
