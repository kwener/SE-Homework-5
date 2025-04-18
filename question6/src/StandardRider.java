public class StandardRider implements Rider {
    private String name;

    public StandardRider(String name) {
        this.name = name;
    }

    @Override
    public void getCoupon(String coupon) {
        System.out.println(name + " received coupon: " + coupon);
    }
}
