// LegacyReservationAdapter.java

import java.util.Objects;

public class LegacyReservationAdapter implements NewReservationInterface {
    private final LegacyReservationSystem legacySystem;

    public LegacyReservationAdapter(LegacyReservationSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String reserveCar(String details) {
        // Enforce non-null, so tests expecting NPE will pass:
        Objects.requireNonNull(details, "details cannot be null");
        return legacySystem.book(details);
    }
}
