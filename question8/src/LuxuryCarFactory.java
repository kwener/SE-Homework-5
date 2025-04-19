public class LuxuryCarFactory extends CarFactory {
    @Override
    public SharableCar createCar() {
        return new LuxuryCar();
    }
}
