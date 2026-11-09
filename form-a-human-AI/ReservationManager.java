import java.util.HashMap;
import java.util.Map;

public class ReservationManager {
    private final int capacity;
    private int remaining;
    private final Map<String, Reservation> reservations = new HashMap<>();

    public ReservationManager(int capacity) {
        this.capacity = capacity;
        this.remaining = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRemaining() {
        return remaining;
    }

    public boolean reserve(String reference, int seats) {
        if (seats <= 0) {
            return false;
        }
        if (reservations.containsKey(reference)) {
            return false;
        }
        if (seats > remaining) {
            return false;
        }
        reservations.put(reference, new Reservation(reference, seats));
        remaining -= seats;
        return true;
    }

    public boolean cancel(String reference) {
        Reservation reservation = reservations.get(reference);
        if (reservation == null) {
            return false;
        }
        remaining += reservation.getSeats();
        reservation.cancel();
        return true;
    }

    public ReservationStatus statusOf(String reference) {
        Reservation reservation = reservations.get(reference);
        if (reservation == null) {
            return null;
        }
        return reservation.getStatus();
    }
}

