public class SUVCar implements SharableCar {
    public SUVCar() {
        displayFeatures();
    }

    @Override
    public String getFeatures() {
        return "SUV Car: Spacious, 4x4, family-friendly";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 2.0;
    }
}
