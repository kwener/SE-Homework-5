import java.util.List;
import java.util.ArrayList;

public class RideCouponService implements CouponSystem {
    private List<Rider> riders = new ArrayList<>();

    @Override
    public void registerRider(Rider rider) {
        riders.add(rider);
    }

    @Override
    public void removeRider(Rider rider) {
        riders.remove(rider);
    }

    @Override
    public void notifyRiders(String coupon) {
        for (Rider rider : riders) {
            rider.getCoupon(coupon);
        }
    }
}
