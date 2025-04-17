package question6.test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class RideCouponServiceTest {

    static class TestRider implements Rider {
        private String name;
        private List<String> receivedCoupons = new ArrayList<>();

        public TestRider(String name) {
            this.name = name;
        }

        @Override
        public void getCoupon(String coupon) {
            receivedCoupons.add(coupon);
        }

        public List<String> getReceivedCoupons() {
            return receivedCoupons;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    public void testSingleRiderReceivesCoupon() {
        RideCouponService service = new RideCouponService();
        TestRider rider = new TestRider("Alice");

        service.registerRider(rider);
        service.notifyRiders("Save 10%");

        assertEquals(1, rider.getReceivedCoupons().size());
        assertEquals("Save 10%", rider.getReceivedCoupons().get(0));
    }

    @Test
    public void testMultipleRidersReceiveCoupon() {
        RideCouponService service = new RideCouponService();
        TestRider rider1 = new TestRider("Alice");
        TestRider rider2 = new TestRider("Bob");

        service.registerRider(rider1);
        service.registerRider(rider2);
        service.notifyRiders("Get 20% off");

        assertEquals(1, rider1.getReceivedCoupons().size());
        assertEquals("Get 20% off", rider1.getReceivedCoupons().get(0));
        assertEquals(1, rider2.getReceivedCoupons().size());
        assertEquals("Get 20% off", rider2.getReceivedCoupons().get(0));
    }

    @Test
    public void testRemovedRiderDoesNotReceiveCoupon() {
        RideCouponService service = new RideCouponService();
        TestRider rider1 = new TestRider("Alice");
        TestRider rider2 = new TestRider("Bob");

        service.registerRider(rider1);
        service.registerRider(rider2);
        service.removeRider(rider1);

        service.notifyRiders("Weekend Deal");

        assertEquals(0, rider1.getReceivedCoupons().size());
        assertEquals(1, rider2.getReceivedCoupons().size());
        assertEquals("Weekend Deal", rider2.getReceivedCoupons().get(0));
    }

    @Test
    public void testNoRidersRegistered() {
        RideCouponService service = new RideCouponService();
        // Just testing that no exceptions occur when no riders are registered
        service.notifyRiders("Hello!");
    }
}
