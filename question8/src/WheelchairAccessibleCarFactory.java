public class WheelchairAccessibleCarFactory extends CarFactory {
    @Override
    public SharableCar createCar() {
        return new WheelchairAccessibleCar();
    }
}
