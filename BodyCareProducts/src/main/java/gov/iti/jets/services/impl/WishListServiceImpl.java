package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.WishListDao;
import gov.iti.jets.persistence.entities.Wishlist;
import gov.iti.jets.persistence.impl.WishListDaoImpl;
import gov.iti.jets.services.WishListService;

public class WishListServiceImpl implements WishListService {
    @Override
    public void saveWishList(Wishlist wishlist) {
        WishListDao wishListDao = new WishListDaoImpl();
        wishListDao.saveWishList(wishlist);
    }
}
