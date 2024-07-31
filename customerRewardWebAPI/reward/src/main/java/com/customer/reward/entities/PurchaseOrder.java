package com.customer.reward.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int poId;
    @OneToMany(mappedBy = "purchaseOrder",cascade = CascadeType.ALL)
    private List<Item> items;
    private int totalAmount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public PurchaseOrder() {
    }

    public PurchaseOrder(int poId, List<Item> items, int totalAmount, Customer customer) {
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
