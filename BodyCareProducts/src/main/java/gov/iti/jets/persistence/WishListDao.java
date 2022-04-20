package gov.iti.jets.persistence;

import gov.iti.jets.persistence.entities.CartProducts;
import gov.iti.jets.persistence.entities.Wishlist;

import java.util.List;

public interface WishListDao {
    void saveWishList(Wishlist wishList);
    List<Wishlist> getWishList(int id);
}
