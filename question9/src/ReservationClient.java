/**
 * Demonstrates the Adapter in action.
 */
public class ReservationClient {
    public static void main(String[] args) {
        LegacyReservationSystem legacySystem = new LegacyReservationSystem();
        NewReservationInterface reservationService = new LegacyReservationAdapter(legacySystem);

        String details = "John Doe, 2025-04-18, Sedan";
        String confirmation = reservationService.reserveCar(details);

        System.out.println(confirmation);
        // Expected output:
        //   Legacy booking confirmed for: John Doe, 2025-04-18, Sedan
    }
}
