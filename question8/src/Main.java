public class Main {
    public static void main(String[] args) {
        testCar(new NormalCarFactory(), 10);
        testCar(new LuxuryCarFactory(), 10);
        testCar(new SUVCarFactory(), 10);
        testCar(new WheelchairAccessibleCarFactory(), 10);
    }

    public static void testCar(CarFactory factory, double distance) {
        SharableCar car = factory.createCar();
        car.displayFeatures();
        System.out.println("Fare for " + distance + " km: $" + car.calculateFare(distance));
        System.out.println("----");
    }
}
