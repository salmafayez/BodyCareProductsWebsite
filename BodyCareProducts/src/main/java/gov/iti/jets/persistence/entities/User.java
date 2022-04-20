package gov.iti.jets.persistence.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "users", catalog = "skincareapp")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id",length = 10)
    private int id;

    @Column(name="birth_date", length=10)
    private LocalDate birthDate;

    @Enumerated
    @Column(name = "user_type")
    private UserType userType;

    @Column(name="user_name")
    private String userName;
    private String email;

    @ElementCollection
    private List<String> interests;

    private String country;
    private String city;

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    private double wallet;
    private String job;
    private String password;

    @Transient
    private String code;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    private List<CartProducts> cartProductsList = new ArrayList<>();

    @OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    private List<Order> orderList = new ArrayList<>();

    public User() {
    }

    public User(int id, LocalDate birthDate, UserType userType, String userName, String email, List<String> interests, String country, String city, String detailedAddress, String phoneNumber, double wallet, String job, String password) {
        this.id = id;
        this.birthDate = birthDate;
        this.userType = userType;
        this.userName = userName;
        this.email = email;
        this.interests = interests;
        this.country = country;
        this.city = city;
        this.detailedAddress = detailedAddress;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet;
        this.job = job;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CartProducts> getCartProductsList() {
        return cartProductsList;
    }

    public void setCartProductsList(List<CartProducts> cartProductsList) {
        this.cartProductsList = cartProductsList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", userType=" + userType +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", interests=" + interests +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", wallet=" + wallet +
                ", job='" + job + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", cartProductsList=" + cartProductsList +
                ", orderList=" + orderList +
                '}';
    }
}
