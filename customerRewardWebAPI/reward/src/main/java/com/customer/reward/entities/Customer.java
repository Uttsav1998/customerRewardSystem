package com.customer.reward.entities;

import jakarta.persistence.*;
import lombok.Lombok;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId ;
    private String name;
    private int age;
    private long number;
    private int rewardPoint;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<PurchaseOrder> purchaseOrders;


    public Customer() {
    }

    public Customer(int customerId, String name, int age, long number,int rewardPoint, List<PurchaseOrder> purchaseOrders) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.number = number;
        this.rewardPoint=rewardPoint;
        this.purchaseOrders = purchaseOrders;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public List<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }
}
