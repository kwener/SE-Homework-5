//package src;

public class RideServiceFacade {
    private RideStrategy rideStrategy;

    public void setRideStrategy(RideStrategy rideStrategy) {
        this.rideStrategy = rideStrategy;
    }

    public void bookRide(String pickup, String destination) {
        if (rideStrategy == null) {
            System.out.println("Error: No ride type selected.");
        } else {
            rideStrategy.bookRide(pickup, destination);
        }
    }
}
