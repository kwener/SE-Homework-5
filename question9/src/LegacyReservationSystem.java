/**
 * Legacy code that we cannot change. Provides its own booking method.
 */
public class LegacyReservationSystem {
    /**
     * Books a reservation using a legacy interface.
     *
     * @param details reservation details
     * @return a confirmation string
     */
    public String book(String details) {
        return "Legacy booking confirmed for: " + details;
    }
}
