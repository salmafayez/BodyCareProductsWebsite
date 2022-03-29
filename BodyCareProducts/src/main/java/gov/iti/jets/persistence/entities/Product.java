package gov.iti.jets.persistence.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id",length =10 )
    private int id;

    @Column(name="product_name",length = 25)
    private String name;

    @Column(name="product_price",length = 10)
    private double price;

    @Column(name="product_quantity",length = 10)
    private int quantity;

    @Column(name="product_description",length = 1500)
    private String description;
    // @Column(name="product_image")
    // private String image;

    // @ManyToOne
    // private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public Category getCategory() {
    //     return category;
    // }

    // public void setCategory(Category category) {
    //     this.category = category;
    // }

    // @OneToMany(mappedBy = "product")
    // private List<CartProducts> cartList = new ArrayList<>();

    // @OneToMany(mappedBy = "product")
    // private List<OrderProducts> ordersList = new ArrayList<>();

    // public String getImage() {
    //     return this.image;
    // }

    // public void setImage(String image) {
    //     this.image = image;
    // }
    
}
