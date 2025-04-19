public class LuxuryCar implements SharableCar {
    public LuxuryCar() {
        displayFeatures();
    }

    @Override
    public String getFeatures() {
        return "Luxury Car: Leather seats, in-car Wi-Fi, drinks";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 3.0;
    }
}
