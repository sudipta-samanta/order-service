package com.example.orderservice.service;

import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.Payment;
import com.example.orderservice.entity.TransactionRequest;
import com.example.orderservice.entity.TransactionResponse;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderRepository repository;

    public TransactionResponse bookOrder(TransactionRequest request) {
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setAmount(order.getAmount());
        payment.setOrderId(order.getId());

        // first process the payment
        Payment paymentReturn = processPayment(payment);

        // placed order
        repository.save(order);
        order.setStatus("order success");

        return new TransactionResponse(order, paymentReturn);
    }

    private Payment processPayment(Payment payment) {
        return restTemplate.postForObject("http://localhost:8082/payment/doPayment", payment, Payment.class);
    }
}
