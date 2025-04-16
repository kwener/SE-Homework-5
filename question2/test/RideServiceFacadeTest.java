
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RideServiceFacadeTest {

    /// tests facade and strategy patterns: if when you make a different kind of car service, it will do the
    ///appropriate functionality when the .bookRide function is called
    @Test
    public void testCarXBooking() {
        RideServiceFacade facade = new RideServiceFacade();
        facade.setRideStrategy(new CarXStrategy());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        facade.bookRide("A", "B");

        String expected = "CarX ride booked from A to B. Private ride.";
        assertTrue(output.toString().trim().contains(expected));
    }

    @Test
    public void testCarPoolBooking() {
        RideServiceFacade facade = new RideServiceFacade();
        facade.setRideStrategy(new CarPoolStrategy());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        facade.bookRide("A", "B");

        String expected = "CarPOOL ride booked from A to B. Shared with other passengers.";
        assertTrue(output.toString().trim().contains(expected));
    }

    @Test
    public void testCarBlackBooking() {
        RideServiceFacade facade = new RideServiceFacade();
        facade.setRideStrategy(new CarBlackStrategy());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        facade.bookRide("A", "B");

        String expected = "CarBLACK luxury ride booked from A to B.";
        assertTrue(output.toString().trim().contains(expected));
    }

    @Test
    public void testNoStrategy() {
        RideServiceFacade facade = new RideServiceFacade();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        facade.bookRide("X", "Y");

        String expected = "Error: No ride type selected.";
        assertTrue(output.toString().trim().contains(expected));
    }
    
}
