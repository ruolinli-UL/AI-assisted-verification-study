public final class VisibleTestRunner {
    private int passed;

    public int runAll() {
        passed = 0;
        testNewTrackerStartsEmpty();
        testValidRecordAddsPoints();
        testInvalidRecordsAreRejected();
        testDistinctRecordsAccumulateForOneStudent();
        testStudentsHaveSeparateTotals();
        testDuplicateRecordIdIsRejected();
        testRejectedRecordDoesNotIncreaseCount();
        testUnknownStudentHasZeroPoints();
        return passed;
    }

    public static void main(String[] args) {
        int result = new VisibleTestRunner().runAll();
        System.out.printf("Visible tests: %d/8 passed%n", result);
    }

    private void testNewTrackerStartsEmpty() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        check(tracker.getRecordCount() == 0,
                "tracker should start with no records");
        check(tracker.getTotalPoints("U1") == 0,
                "student should start with zero points");
        passed++;
    }

    private void testValidRecordAddsPoints() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        check(tracker.record(new PointsRecord("R1", "U1", 3)),
                "valid record should be accepted");
        check(tracker.getTotalPoints("U1") == 3,
                "accepted record should add its points");
        passed++;
    }

    private void testInvalidRecordsAreRejected() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        check(!tracker.record(null), "null record should be rejected");
        check(!tracker.record(new PointsRecord("R1", "U1", 0)),
                "zero points should be rejected");
        check(!tracker.record(new PointsRecord("", "U1", 2)),
                "blank record ID should be rejected");
        passed++;
    }

    private void testDistinctRecordsAccumulateForOneStudent() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        tracker.record(new PointsRecord("R1", "U1", 3));
        tracker.record(new PointsRecord("R2", "U1", 4));
        check(tracker.getTotalPoints("U1") == 7,
                "distinct records should accumulate");
        passed++;
    }

    private void testStudentsHaveSeparateTotals() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        tracker.record(new PointsRecord("R1", "U1", 3));
        tracker.record(new PointsRecord("R2", "U2", 5));
        check(tracker.getTotalPoints("U1") == 3,
                "U1 total should be separate");
        check(tracker.getTotalPoints("U2") == 5,
                "U2 total should be separate");
        passed++;
    }

    private void testDuplicateRecordIdIsRejected() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        check(tracker.record(new PointsRecord("R1", "U1", 3)),
                "first record should be accepted");
        check(!tracker.record(new PointsRecord("R1", "U1", 3)),
                "duplicate record ID should be rejected");
        check(tracker.getRecordCount() == 1,
                "duplicate record should not be stored twice");
        passed++;
    }

    private void testRejectedRecordDoesNotIncreaseCount() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        tracker.record(new PointsRecord("R1", "U1", -2));
        check(tracker.getRecordCount() == 0,
                "rejected record should not be stored");
        passed++;
    }

    private void testUnknownStudentHasZeroPoints() {
        StudentPointsTracker tracker = new StudentPointsTracker();
        check(tracker.getTotalPoints("UNKNOWN") == 0,
                "unknown student should have zero points");
        passed++;
    }

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}

