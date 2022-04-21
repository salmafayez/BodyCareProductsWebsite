package gov.iti.jets.services;

import gov.iti.jets.persistence.entities.Wishlist;

import java.util.List;

public interface WishListService {
    void saveWishList(Wishlist wishlist);
    List<Wishlist> getWishListList(int id);
}
