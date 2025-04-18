import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class RideServiceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testBaseRideService() {
        RideService rideService = new RideService();
        rideService.getRide();
        assertTrue(outContent.toString().contains("Getting car service"));
    }

    @Test
    public void testLAServiceOutput() {
        Service laService = new LAService(new RideService());
        laService.getRide();
        assertTrue(outContent.toString().contains("Getting car service"));
    }

    @Test
    public void testAspenServiceOutput() {
        Service aspenService = new AspenService(new RideService());
        aspenService.getRide();
        assertTrue(outContent.toString().contains("Getting car service"));
    }

    @Test
    public void testLAServiceExtraMethod() {
        LAService laService = new LAService(new RideService());
        laService.orderLimo();
        assertTrue(outContent.toString().contains("ordering a Limo"));
    }

    @Test
    public void testAspenServiceExtraMethod() {
        AspenService aspenService = new AspenService(new RideService());
        aspenService.snowRide();
        assertTrue(outContent.toString().contains("certified snow safe vehicle"));
    }
}
