package question10.test;

import question10.src.CityDecorator;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CityDecoratorTest {

    @Test
    public void testBaseRideService() {
        CityDecorator.Service baseRide = new CityDecorator.rideService();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        baseRide.getRide();

        String result = output.toString().trim();
        assertTrue(result.contains("Getting car service"));
    }

    @Test
    public void testLAServiceDecorator() {
        CityDecorator.Service laRide = new CityDecorator.LAService(new CityDecorator.rideService());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        laRide.getRide();  // Decorator forwards to base
        ((CityDecorator.LAService) laRide).orderLimo(); // Call LA-specific method

        String result = output.toString().trim();
        assertTrue(result.contains("Getting car service"));
        assertTrue(result.contains("In LA, ordering a Limo"));
    }

    @Test
    public void testAspenServiceDecorator() {
        CityDecorator.Service aspenRide = new CityDecorator.AspenService(new CityDecorator.rideService());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        aspenRide.getRide(); // Decorator
