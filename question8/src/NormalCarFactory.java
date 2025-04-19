public class NormalCarFactory extends CarFactory {
    @Override
    public SharableCar createCar() {
        return new NormalCar();
    }
}
