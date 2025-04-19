package com.example.question5;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, int drivers, int requests, String timeOfDay) {
        return basePrice; // flat rate
    }
}
