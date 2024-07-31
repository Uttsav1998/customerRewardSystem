package com.customer.reward.dto;

import com.customer.reward.entities.Customer;
import com.customer.reward.entities.Item;
import jakarta.persistence.*;

import java.util.List;

public class PurchaseOrderDto {

    private int poId;
    private List<Item> items;
    private int totalAmount;
    private Customer customer;

    public PurchaseOrderDto() {
    }

    public PurchaseOrderDto(int poId, List<Item> items, int totalAmount, Customer customer) {
        this.poId = poId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public int getPoId() {
        return poId;
    }

    public void setPoId(int poId) {
        this.poId = poId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
