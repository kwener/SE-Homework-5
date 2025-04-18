public class CouponDistributionSystem {
    public static void main(String[] args) {
        // Create the Coupon Service (Subject)
        RideCouponService couponService = new RideCouponService();

        // Create Riders (Observers)
        Rider rider1 = new StandardRider("Alice");
        Rider rider2 = new StandardRider("Bob");

        // Register riders
        couponService.registerRider(rider1);
        couponService.registerRider(rider2);

        // Send coupon
        couponService.notifyRiders("Get 15% off your next ride!");
    }
}
