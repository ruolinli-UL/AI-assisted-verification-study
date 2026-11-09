public final class VisibleTestRunner {
    private int passed;

    public int runAll() {
        passed = 0;
        testNewManagerStartsWithFullCapacity();
        testReserveReducesRemainingCapacity();
        testInvalidAndOversizedReservationsAreRejected();
        testDuplicateReferenceIsRejected();
        testMultipleReservationsShareCapacity();
        testCancelActiveReservationRestoresCapacity();
        testCancelUnknownReservationIsRejected();
        testStatusOfUnknownReservationIsNull();
        return passed;
    }

    public static void main(String[] args) {
        int result = new VisibleTestRunner().runAll();
        System.out.printf("Visible tests: %d/8 passed%n", result);
    }

    private void testNewManagerStartsWithFullCapacity() {
        ReservationManager manager = new ReservationManager(10);
        check(manager.getCapacity() == 10, "capacity should begin at 10");
        check(manager.getRemaining() == 10, "remaining should begin at 10");
        passed++;
    }

    private void testReserveReducesRemainingCapacity() {
        ReservationManager manager = new ReservationManager(10);
        check(manager.reserve("A", 3), "valid reservation should succeed");
        check(manager.getRemaining() == 7, "three seats should be consumed");
        check(manager.statusOf("A") == ReservationStatus.ACTIVE, "reservation should be active");
        passed++;
    }

    private void testInvalidAndOversizedReservationsAreRejected() {
        ReservationManager manager = new ReservationManager(10);
        check(!manager.reserve("ZERO", 0), "zero seats should be rejected");
        check(!manager.reserve("TOO-LARGE", 11), "oversized reservation should be rejected");
        check(manager.getRemaining() == 10, "rejected reservations must not change capacity");
        passed++;
    }

    private void testDuplicateReferenceIsRejected() {
        ReservationManager manager = new ReservationManager(10);
        check(manager.reserve("A", 3), "first reservation should succeed");
        check(!manager.reserve("A", 3), "duplicate reference should be rejected");
        check(manager.getRemaining() == 7, "duplicate request must not consume seats");
        passed++;
    }

    private void testMultipleReservationsShareCapacity() {
        ReservationManager manager = new ReservationManager(10);
        check(manager.reserve("A", 3), "first reservation should succeed");
        check(manager.reserve("B", 4), "second reservation should succeed");
        check(manager.getRemaining() == 3, "remaining capacity should be shared");
        passed++;
    }

    private void testCancelActiveReservationRestoresCapacity() {
        ReservationManager manager = new ReservationManager(10);
        manager.reserve("A", 3);
        check(manager.cancel("A"), "active reservation should cancel");
        check(manager.getRemaining() == 10, "cancel should restore seats");
        check(manager.statusOf("A") == ReservationStatus.CANCELLED, "status should be cancelled");
        passed++;
    }

    private void testCancelUnknownReservationIsRejected() {
        ReservationManager manager = new ReservationManager(10);
        check(!manager.cancel("UNKNOWN"), "unknown reservation should not cancel");
        check(manager.getRemaining() == 10, "unknown cancellation must not change capacity");
        passed++;
    }

    private void testStatusOfUnknownReservationIsNull() {
        ReservationManager manager = new ReservationManager(10);
        check(manager.statusOf("UNKNOWN") == null, "unknown reservation should have no status");
        passed++;
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}

