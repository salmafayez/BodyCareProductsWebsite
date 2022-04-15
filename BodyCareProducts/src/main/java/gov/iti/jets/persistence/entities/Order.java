package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "orders", catalog = "skincareapp")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id",length = 10)
    private int id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name="order_time", length=10)
    private LocalDate orderTime;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    private List<LineItem> lineItemList = new ArrayList<>();

    public Order() {
    }

    public Order(User user, int totalPrice, LocalDate orderTime) {
        this.id = id;
        this.user = user;
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDate orderTime) {
        this.orderTime = orderTime;
    }

    public List<LineItem> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", totalPrice=" + totalPrice +
                ", orderTime=" + orderTime +
                ", lineItemList=" + lineItemList +
                '}';
    }
}
