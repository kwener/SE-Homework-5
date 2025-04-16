
import java.util.Scanner;

public class RideServiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //make instance of ride service facade 
        RideServiceFacade rideService = new RideServiceFacade();
        
        //set the attributes of the Ride Service Facade (pickup and dropoff)
        System.out.println("Enter pickup location:");
        String pickup = scanner.nextLine();
        System.out.println("Enter destination:");
        String destination = scanner.nextLine();

        //have user select ride type they want
        //this is the facade strategy, where the complexities of the system are hidden
        System.out.println("Select ride type: 1 - CarPOOL, 2 - CarX, 3 - CarBlack");
        int choice = scanner.nextInt();
        scanner.close();
        switch (choice) {
            case 1 -> rideService.setRideStrategy(new CarPoolStrategy());
            case 2 -> rideService.setRideStrategy(new CarXStrategy());
            case 3 -> rideService.setRideStrategy(new CarBlackStrategy());
            default -> {
                System.out.println("Invalid choice. Exiting...");
                return;
            }
        }

        rideService.bookRide(pickup, destination);

    }
}

