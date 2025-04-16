

public class CarPoolStrategy implements RideStrategy {
    public void bookRide(String pickup, String destination) {
        System.out.println("CarPOOL ride booked from " + pickup + " to " + destination + ". Shared with other passengers.");
    }
}