package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;

@Entity
public class Wishlist {
    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ),
            @AttributeOverride(name="productId", column= @Column(name="product_id", nullable=false) ) } )
    private CartId cartId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", insertable = false, updatable = false)
    private Product product;

    public Wishlist(CartId cartId, User user, Product product) {
        this.cartId = cartId;
        this.user = user;
        this.product = product;
    }

    public CartId getCartId() {
        return cartId;
    }

    public void setCartId(CartId cartId) {
        this.cartId = cartId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }  
}
