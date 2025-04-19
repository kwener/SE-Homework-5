// test/LegacyReservationAdapterTest.java

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 tests for LegacyReservationAdapter.
 */
public class LegacyReservationAdapterTest {

    @Test
    public void testReserveCar_delegatesToLegacySystem() {
        LegacyReservationSystem legacy = new LegacyReservationSystem();
        NewReservationInterface adapter = new LegacyReservationAdapter(legacy);
        String details = "Alice, 2025-05-01, SUV";

        String result = adapter.reserveCar(details);
        assertEquals(
            "Legacy booking confirmed for: " + details,
            result
        );
    }

    @Test
    public void testReserveCar_withEmptyDetails() {
        LegacyReservationSystem legacy = new LegacyReservationSystem();
        NewReservationInterface adapter = new LegacyReservationAdapter(legacy);

        String result = adapter.reserveCar("");
        assertEquals(
            "Legacy booking confirmed for: ",
            result
        );
    }

    @Test(expected = NullPointerException.class)
    public void testReserveCar_nullDetails_throwsNPE() {
        LegacyReservationSystem legacy = new LegacyReservationSystem();
        NewReservationInterface adapter = new LegacyReservationAdapter(legacy);

        // This should throw NullPointerException from legacy.book(null)
        adapter.reserveCar(null);
    }
}
