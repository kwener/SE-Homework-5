
import java.util.List;
import java.util.ArrayList;

interface Rider{
    void getCoupon(String coupon);
}

class standardRider implements Rider{
    private String name;
    public standardRider(String name){
        this.name = name;
    }

    @Override
    public void getCoupon(String coupon){
        System.out.println(name + " recieved coupon: " + coupon);
    }
}

interface CouponSystem{
    void registerRider(Rider rider);
    void removeRider(Rider rider);
    void notifyRiders(String coupon);
}

class RideCouponService implements CouponSystem{
    private List<Rider> riders = new ArrayList<>();

    @Override
    public void registerRider(Rider rider){
        riders.add(rider);
    }

    @Override
    public void removeRider(Rider rider){
        riders.remove(rider);
    }

    @Override
    public void notifyRiders(String coupon){
        for(Rider rider : riders){
            rider.getCoupon(coupon);
        }
    }
}

public class CouponDistributionSystem{
    public static void main(String[] args) {
        // Create the Coupon Service (Subject)
        RideCouponService couponService = new RideCouponService();

        // Create Riders (Observers)
        Rider rider1 = new standardRider("Alice");
        Rider rider2 = new standardRider("Bob");

        couponService.registerRider(rider1);
        couponService.registerRider(rider2);

        couponService.notifyRiders("Get 15% off your next ride!");
    }
}