// Rider class
public class Rider {
    private final String name;
    private final Mediator mediator;

    private String message;

    public Rider(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        if (mediator instanceof SocialNetworkMediator) {
            ((SocialNetworkMediator) mediator).registerRider(this);
        }
    }

    public void sendMessageTo(Rider to, String message) {
        System.out.println(name + " sends to " + to.name + ": " + message);
        mediator.sendMessage(this, to, message);
    }

    public void broadcast(String message) {
        System.out.println(name + " broadcasts " + message);
    }

    public void receiveMessage(Rider from, String message) {
        this.message = message;
        System.out.println(name + " received from " + from.name + ": " + message);
    }

    public String getMessage() {
        return message;
    }
}
