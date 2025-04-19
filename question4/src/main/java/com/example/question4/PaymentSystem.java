package com.example.question4;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.pay(23.50);
    }
}