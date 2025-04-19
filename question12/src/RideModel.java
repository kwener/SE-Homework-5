import java.util.HashMap;
import java.util.Map;

public class RideModel {
    private final Map<String, String> data = new HashMap<>();

    public RideModel() {
        data.put("pickup", "Default Pickup");
        data.put("destination", "Default Destination");
    }

    /** Returns a copy of the current data. */
    public Map<String, String> getData() {
        return new HashMap<>(data);
    }

    /** Updates and returns the new data. */
    public Map<String, String> updateData(String pickup, String destination) {
        data.put("pickup", pickup);
        data.put("destination", destination);
        return getData();
    }
}
