

public class CarBlackStrategy implements RideStrategy {
    public void bookRide(String pickup, String destination) {
        System.out.println("CarBLACK luxury ride booked from " + pickup + " to " + destination + ".");
    }
}