public class Main {
    public static void main(String[] args) {
        SocialNetworkMediator mediator = new SocialNetworkMediator();
        Rider alice = new Rider("Alice", mediator);
        Rider bob = new Rider("Bob", mediator);
        Rider charlie = new Rider("Charlie", mediator);
        alice.sendMessageTo(bob, "Hey Bob, ready to ride?");
        bob.sendMessageTo(alice, "Absolutely!");
        charlie.broadcast("Morning folks! Anyone up for a trail run?");
    }
}
