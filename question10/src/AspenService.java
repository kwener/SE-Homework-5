

public class AspenService extends CityServiceDecorator {

    public AspenService(Service decoratedRide) {
        super(decoratedRide);
    }

    @Override
    public void getRide() {
        super.getRide();
    }

    public void snowRide() {
        System.out.println("In Aspen, ordering certified snow safe vehicle");
    }
}
