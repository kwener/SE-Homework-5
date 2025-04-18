public abstract class CityServiceDecorator implements Service {
    protected Service decoratedCityService;

    public CityServiceDecorator(Service decoratedCityService) {
        this.decoratedCityService = decoratedCityService;
    }

    @Override
    public void getRide() {
        decoratedCityService.getRide();
    }
}