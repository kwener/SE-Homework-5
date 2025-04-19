public class SUVCarFactory extends CarFactory {
    @Override
    public SharableCar createCar() {
        return new SUVCar();
    }
}
