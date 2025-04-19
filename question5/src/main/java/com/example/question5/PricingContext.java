package com.example.question5;

public class PricingContext {
    private PricingStrategy strategy;
    private int drivers;
    private int requests;
    private String timeOfDay;

    public void setContextData(int drivers, int requests, String timeOfDay) {
        this.drivers = drivers;
        this.requests = requests;
        this.timeOfDay = timeOfDay;
    }

    public void chooseStrategy() {
        if (requests > drivers * 1.5) {
            this.strategy = new SurgePricingStrategy();
        } else {
            this.strategy = new RegularPricingStrategy();
        }
    }

    public double getPrice(double basePrice) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set. Call chooseStrategy() first.");
        }
        return strategy.calculatePrice(basePrice, drivers, requests, timeOfDay);
    }
}
