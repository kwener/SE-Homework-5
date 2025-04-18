public class LAService extends CityServiceDecorator {

    public LAService(Service decoratedRide) {
        super(decoratedRide);
    }

    @Override
    public void getRide() {
        super.getRide();
    }

    public void orderLimo() {
        System.out.println("In LA, ordering a Limo");
    }
}