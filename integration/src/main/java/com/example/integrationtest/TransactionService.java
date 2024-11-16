package com.example.integrationtest;

public class TransactionService {
    
    private PaymentService paymentService;

    public TransactionService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String placeOrder(String orderId, double amount) {
        if (paymentService.processPayment(orderId, amount)) {
            return "Order placed successfully";
        } else {
            return "Payment failed";
        }
    }
}
