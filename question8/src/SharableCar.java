public interface SharableCar {
    String getFeatures();

    default void displayFeatures() {
        System.out.println(getFeatures());
    }

    double calculateFare(double distance);
}
