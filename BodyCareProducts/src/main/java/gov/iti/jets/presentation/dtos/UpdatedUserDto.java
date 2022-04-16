package gov.iti.jets.presentation.dtos;

import gov.iti.jets.persistence.entities.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.util.List;

public class UpdatedUserDto {


    private String userName;
    private String email;
    private String country;
    private String city;
    private String detailedAddress;
    private String phoneNumber;
    private double wallet;
    private String password;

    public UpdatedUserDto() {
    }

    public UpdatedUserDto( String userName, String email, String country, String city, String detailedAddress, String phoneNumber, double wallet, String password) {

        this.userName = userName;
        this.email = email;
        this.country = country;
        this.city = city;
        this.detailedAddress = detailedAddress;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UpdatedUserDto{" +

                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", wallet=" + wallet +
                ", password='" + password + '\'' +
                '}';
    }
}
