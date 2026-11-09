public final class ParticipantTestRunner {
    private int passed;

    public int runAll() {
        passed = 0;

        // Add a call to each test method you create here.
        // Example: testYourChosenCase();

        return passed;
    }

    public static void main(String[] args) {
        int result = new ParticipantTestRunner().runAll();
        System.out.printf("Participant tests completed: %d passed%n", result);
    }

    /*
     * Use this structure for each test you add:
     *
     * private void testYourChosenCase() {
     *     ReservationManager manager = new ReservationManager(10);
     *
     *     // Arrange and perform the operations you want to examine.
     *
     *     check(conditionYouExpect, "explain the expected behaviour");
     *     passed++;
     * }
     */

    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }
}

