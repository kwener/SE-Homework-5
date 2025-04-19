import java.util.ArrayList;
import java.util.List;

public class SocialNetworkMediator implements Mediator {
    private final List<Rider> riders = new ArrayList<>();

    public void registerRider(Rider rider) {
        if (!riders.contains(rider)) {
            riders.add(rider);
        }
    }

    @Override
    public void sendMessage(Rider from, Rider to, String message) {
        to.receiveMessage(from, message);
    }

    @Override
    public void broadcastMessage(Rider from, String message) {
        for (Rider r : riders) {
            if (r != from) {
                r.receiveMessage(from, message);
            }
        }
    }
}
