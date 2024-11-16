package com.example.integrationtest;

public class PaymentService {

    public boolean processPayment(String orderId, double amount) {
        // Simulating a successful payment
        return amount > 0;
    }
    
}
