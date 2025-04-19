public class NormalCar implements SharableCar {
    public NormalCar() {
        displayFeatures();
    }

    @Override
    public String getFeatures() {
        return "Normal Car: Basic seats, AC.";
    }

    @Override
    public double calculateFare(double distance) {
        return distance;
    }
}
