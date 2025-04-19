import org.junit.Test;

import static org.junit.Assert.*;

public class MediatorTest {
    @Test
    public void broadcastTest() {
        SocialNetworkMediator mediator = new SocialNetworkMediator();
        Rider rider1 = new Rider("Miles", mediator);
        Rider rider2 = new Rider("Kiersten", mediator);
        Rider rider3 = new Rider("Hanma", mediator);
        Rider rider4 = new Rider("Nabeela", mediator);

        mediator.broadcastMessage(rider1, "Hello all!");
        assertEquals(rider2.getMessage(), "Hello all!");
        assertEquals(rider3.getMessage(), "Hello all!");
        assertEquals(rider4.getMessage(), "Hello all!");
    }

    @Test
    public void sendMessageTest() {
        SocialNetworkMediator mediator = new SocialNetworkMediator();
        Rider rider1 = new Rider("Miles", mediator);
        Rider rider2 = new Rider("Kiersten", mediator);
        Rider rider3 = new Rider("Hanma", mediator);
        Rider rider4 = new Rider("Nabeela", mediator);

        rider1.sendMessageTo(rider2, "Hello Kiersten!");
        assertEquals(rider2.getMessage(), "Hello Kiersten!");

        rider1.sendMessageTo(rider3, "Hello Hanma!");
        assertEquals(rider3.getMessage(), "Hello Hanma!");

        rider1.sendMessageTo(rider4, "Hello Nabeela!");
        assertEquals(rider4.getMessage(), "Hello Nabeela!");
    }
}
