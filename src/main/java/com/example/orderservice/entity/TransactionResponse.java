package com.example.orderservice.entity;

public class TransactionResponse {
    private Order order;
    private Payment payment;

    public TransactionResponse() {
    }

    public TransactionResponse(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "TransactionRequest{" +
                "order=" + order +
                ", payment=" + payment +
                '}';
    }
}
