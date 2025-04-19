// Mediator interface
public interface Mediator {
    void sendMessage(Rider from, Rider to, String message);

    void broadcastMessage(Rider from, String message);
}
