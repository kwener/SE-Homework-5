public class WheelchairAccessibleCar implements SharableCar {
    public WheelchairAccessibleCar() {
        displayFeatures();
    }

    @Override
    public String getFeatures() {
        return "Wheelchair Accessible Car: Ramp access, extra space";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 1.5;
    }
}
