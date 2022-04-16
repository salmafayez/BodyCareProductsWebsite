package gov.iti.jets.presentation.dtos;

import java.io.Serializable;

public class LineItemDto implements Serializable {

    private String productName;
    private int productQuantity;
    private Double productPrice;

    public LineItemDto() {

    }
    public LineItemDto(String productName, int productQuantity, Double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
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

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
