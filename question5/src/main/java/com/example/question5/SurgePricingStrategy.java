package com.example.question5;

public class SurgePricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice, int drivers, int requests, String timeOfDay) {
        double surgeFactor = Math.min((double) requests / drivers, 2.0); // cap at 2x
        return basePrice * (1 + surgeFactor);
    }
}
