package com.example.orderservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ORDER_TB")
public class Order {
    @Id
    private int id;
    @Transient
    private String status;
    private double amount;
    private String orderDetails;

    public Order() {
    }

    public Order(String status, double amount, String orderDetails) {
        this.status = status;
        this.amount = amount;
        this.orderDetails = orderDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
