
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class LegacyRideControllerTest {

    @Test
    public void testRequestRide_andRideStatus() {
        RideController controller = new RideController();

        // Prepare request data
        Map<String, String> req1 = Map.of(
            "pickup", "Home",
            "destination", "Office"
        );

        // Call requestRide
        Map<String, Object> response1 = controller.requestRide(req1);
        assertEquals("Ride requested successfully", response1.get("message"));

        // Extract the RideRequest object
        Object rideObj = response1.get("ride");
        assertTrue(rideObj instanceof RideRequest);
        RideRequest ride1 = (RideRequest) rideObj;

        assertEquals("Home", ride1.getPickup());
        assertEquals("Office", ride1.getDestination());
        assertEquals("requested", ride1.getStatus());

        // Now call rideStatus and verify the list contains exactly that one ride
        Map<String, Object> statusResp = controller.rideStatus();
        Object ridesObj = statusResp.get("rides");
        assertTrue(ridesObj instanceof List<?>);

        List<?> rides = (List<?>) ridesObj;
        assertEquals(1, rides.size());
        RideRequest listed = (RideRequest) rides.get(0);

        assertEquals("Home", listed.getPickup());
        assertEquals("Office", listed.getDestination());
        assertEquals("requested", listed.getStatus());
    }
}
