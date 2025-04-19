/**
 * The interface expected by the new reservation system.
 */
public interface NewReservationInterface {
    /**
     * Reserves a car using the given details.
     *
     * @param details a description of the reservation (e.g., customer name, date, car type)
     * @return a confirmation string
     */
    String reserveCar(String details);
}
