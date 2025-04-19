
public class RideRequest {
    private String pickup;
    private String destination;
    private String status;

    public RideRequest() {}

    public RideRequest(String pickup, String destination, String status) {
        this.pickup = pickup;
        this.destination = destination;
        this.status = status;
    }

    public String getPickup() { return pickup; }
    public void setPickup(String pickup) { this.pickup = pickup; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
