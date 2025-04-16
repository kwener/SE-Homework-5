

public class CarXStrategy implements RideStrategy {
    public void bookRide(String pickup, String destination) {
        System.out.println("CarX ride booked from " + pickup + " to " + destination + ". Private ride.");
    }
}
