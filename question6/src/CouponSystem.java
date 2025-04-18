public interface CouponSystem {
    void registerRider(Rider rider);
    void removeRider(Rider rider);
    void notifyRiders(String coupon);
}
