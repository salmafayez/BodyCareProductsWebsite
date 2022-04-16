package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "lineitems", catalog = "skincareapp")
public class LineItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id",length = 10)
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_quantity")
    private int productQuantity;

    @Column(name = "product_price")
    private Double productPrice;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    public LineItem() {
    }

    public LineItem(String productName, int productQuantity, Double productPrice, Order order) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", order=" + order +
                '}';
    }
}
