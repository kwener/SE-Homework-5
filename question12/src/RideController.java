import java.util.Map;

public class RideController {
    private final RideModel model;

    public RideController(RideModel model) {
        this.model = model;
    }

    /**
     * If both pickup & destination are non-null, updates the model;
     * otherwise returns current data.
     */
    public Map<String, String> handleRequest(String pickup, String destination) {
        if (pickup != null && destination != null) {
            return model.updateData(pickup, destination);
        } else {
            return model.getData();
        }
    }
}
