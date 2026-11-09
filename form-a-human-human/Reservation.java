public final class Reservation {
    private final String reference;
    private final int seats;
    private ReservationStatus status;

    public Reservation(String reference, int seats) {
        this.reference = reference;
        this.seats = seats;
        this.status = ReservationStatus.ACTIVE;
    }

    public String getReference() {
        return reference;
    }

    public int getSeats() {
        return seats;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void cancel() {
        status = ReservationStatus.CANCELLED;
    }
}

