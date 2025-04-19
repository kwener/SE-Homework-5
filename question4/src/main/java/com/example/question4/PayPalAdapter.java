package com.example.question4;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalPayment paypal;

    public PayPalAdapter() {
        this.paypal = new PayPalPayment();
    }

    // Add this for testing support:
    public PayPalAdapter(PayPalPayment paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount) {
        paypal.makePayment(amount);
    }
}