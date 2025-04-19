package com.example.question5;

public interface PricingStrategy {
    double calculatePrice(double basePrice, int driversAvailable, int rideRequests, String timeOfDay);
}
