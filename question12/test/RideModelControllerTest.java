import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class RideModelControllerTest {

    @Test
    public void testModelDefaultData() {
        RideModel model = new RideModel();
        Map<String, String> data = model.getData();

        assertEquals("Default Pickup",    data.get("pickup"));
        assertEquals("Default Destination", data.get("destination"));

        // Ensure getData returns a copy
        data.put("pickup", "X");
        Map<String,String> again = model.getData();
        assertEquals("Default Pickup", again.get("pickup"));
    }

    @Test
    public void testModelUpdateData() {
        RideModel model = new RideModel();
        Map<String, String> updated = model.updateData("Home", "Office");

        assertEquals("Home",    updated.get("pickup"));
        assertEquals("Office",  updated.get("destination"));

        // Confirm the model actually holds the new values
        Map<String,String> snapshot = model.getData();
        assertEquals("Home",    snapshot.get("pickup"));
        assertEquals("Office",  snapshot.get("destination"));
    }

    @Test
    public void testControllerGetData() {
        RideModel model = new RideModel();
        RideController controller = new RideController(model);

        // Both null → should just return default
        Map<String, String> got = controller.handleRequest(null, null);
        assertEquals("Default Pickup",    got.get("pickup"));
        assertEquals("Default Destination", got.get("destination"));
    }

    @Test
    public void testControllerUpdateData() {
        RideModel model = new RideModel();
        RideController controller = new RideController(model);

        // Provide new values → should update
        Map<String, String> updated = controller.handleRequest("A", "B");
        assertEquals("A", updated.get("pickup"));
        assertEquals("B", updated.get("destination"));

        // And a subsequent GET (null,null) reflects the new state
        Map<String, String> after = controller.handleRequest(null, null);
        assertEquals("A", after.get("pickup"));
        assertEquals("B", after.get("destination"));
    }
}
