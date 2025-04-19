import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {
    @Test
    public void normalCarFactoryTest() {
        assertEquals(new NormalCarFactory().createCar().getFeatures(), new NormalCar().getFeatures());
    }

    @Test
    public void luxuryCarFactoryTest() {
        assertEquals(new LuxuryCarFactory().createCar().getFeatures(), new LuxuryCar().getFeatures());
    }

    @Test
    public void suvCarFactoryTest() {
        assertEquals(new SUVCarFactory().createCar().getFeatures(), new SUVCar().getFeatures());
    }

    @Test
    public void wheelchairCarFactoryTest() {
        assertEquals(new WheelchairAccessibleCarFactory().createCar().getFeatures(), new WheelchairAccessibleCar().getFeatures());
    }
}
