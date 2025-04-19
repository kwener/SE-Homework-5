
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class RideController {
    private final List<RideRequest> rideRequests = new ArrayList<>();

    // Simulates POST /ride/request
    public Map<String, Object> requestRide(Map<String, String> requestData) {
        String pickup = requestData.get("pickup");
        String destination = requestData.get("destination");

        RideRequest rideRequest = new RideRequest(pickup, destination, "requested");
        rideRequests.add(rideRequest);

        Map<String, Object> resp = new HashMap<>();
        resp.put("message", "Ride requested successfully");
        resp.put("ride", rideRequest);
        return resp;
    }

    // Simulates GET /ride/status
    public Map<String, Object> rideStatus() {
        Map<String, Object> resp = new HashMap<>();
        resp.put("rides", rideRequests);
        return resp;
    }
}
