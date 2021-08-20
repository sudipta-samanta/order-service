package com.example.orderservice.entity;

public class Payment {

    private int id;
    private String status;
    private double amount;
    private String transactionId;
    private int orderId;

    public Payment() {
    }

    public Payment(String status, int amount, String transactionId, int orderId) {
        this.status = status;
        this.amount = amount;
        this.transactionId = transactionId;
        this.orderId = orderId;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
