package gov.iti.jets.services.impl;

import gov.iti.jets.persistence.WishListDao;
import gov.iti.jets.persistence.entities.Wishlist;
import gov.iti.jets.persistence.impl.WishListDaoImpl;
import gov.iti.jets.services.WishListService;

import java.util.List;

public class WishListServiceImpl implements WishListService {
    @Override
    public void saveWishList(Wishlist wishlist) {
        WishListDao wishListDao = new WishListDaoImpl();
        wishListDao.saveWishList(wishlist);
    }

    @Override
    public List<Wishlist> getWishListList(int id) {
        WishListDao wishListDao = new WishListDaoImpl();
        return wishListDao.getWishList(id);
    }
}
