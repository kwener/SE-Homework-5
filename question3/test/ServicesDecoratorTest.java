
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ServicesDecoratorTest {

    @Test
    public void testRideServiceOutput() {
        aService ride = new rideService();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        ride.getRide();

        assertTrue(output.toString().trim().contains("Getting car service"));
    }

    @Test
    public void testCarEatsDecoratorOutput() {
        aService ride = new rideService();
        carEats eats = new carEats(ride);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        eats.getRide();
        eats.orderFood();

        String result = output.toString();
        assertTrue(result.contains("Getting car service"));
        assertTrue(result.contains("Ordering food service"));
    }

    @Test
    public void testCarGoDecoratorOutput() {
        aService ride = new rideService();
        carGo go = new carGo(ride);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        go.getRide();
        go.hatchbackRide();

        String result = output.toString();
        assertTrue(result.contains("Getting car service"));
        assertTrue(result.contains("Requesting hatchback ride"));
    }
}
