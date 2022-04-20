package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartproducts", catalog = "skincareapp")
public class CartProducts implements Serializable {
    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ),
            @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    private CartId cartId;

    @Column(name = "total_price")
    private int totalPrice;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", insertable = false, updatable = false)
    private Product product;

    private int quantity;

    public CartProducts() {
    }

    public CartProducts(CartId cartId, int totalPrice, User user, Product product, int quantity) {
        this.cartId = cartId;
        this.totalPrice = totalPrice;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public CartId getCartId() {
        return cartId;
    }

    public void setCartId(CartId cartId) {
        this.cartId = cartId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartProducts{" +
                "cartId=" + cartId +
                ", totalPrice=" + totalPrice +
                ", user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }

}
