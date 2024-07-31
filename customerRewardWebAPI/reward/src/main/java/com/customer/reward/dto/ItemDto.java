package com.customer.reward.dto;

import com.customer.reward.entities.PurchaseOrder;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;


public class ItemDto {
    private int itemId;
    private String name;
    private int price;
    private PurchaseOrder purchaseOrder;

    public ItemDto() {
    }

    public ItemDto(int itemId, String name, int price, PurchaseOrder purchaseOrder) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.purchaseOrder = purchaseOrder;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
