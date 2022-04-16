package gov.iti.jets.presentation.dtos;

import gov.iti.jets.persistence.entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDto {

    private double totalPrice;
    private LocalDate orderTime;
    private User user;
    private List<LineItemDto> lineItemList = new ArrayList<>();

    public OrderDto() {
    }

    public OrderDto(double totalPrice, LocalDate orderTime, List<LineItemDto> lineItemList) {
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
        this.lineItemList = lineItemList;
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

    public List<LineItemDto> getLineItemList() {
        return lineItemList;
    }

    public void setLineItemList(List<LineItemDto> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public void addLineItem(LineItemDto lineItemDto){
        this.lineItemList.add(lineItemDto);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
