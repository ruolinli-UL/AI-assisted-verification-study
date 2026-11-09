import java.util.HashMap;
import java.util.Map;

public final class StudentPointsTracker {
    private final Map<String, PointsRecord> recordsById =
            new HashMap<>();

    private final Map<String, Integer> totalPointsByStudent =
            new HashMap<>();

    public boolean record(PointsRecord record) {
        if (record == null) {
            return false;
        }
        if (record.getRecordId() == null
                || record.getRecordId().isBlank()) {
            return false;
        }
        if (record.getStudentId() == null
                || record.getStudentId().isBlank()) {
            return false;
        }
        if (record.getPoints() <= 0) {
            return false;
        }

        boolean isNewRecord =
                !recordsById.containsKey(record.getRecordId());

        if (isNewRecord) {
            recordsById.put(record.getRecordId(), record);
        }

        int currentTotal =
                getTotalPoints(record.getStudentId());

        totalPointsByStudent.put(
                record.getStudentId(),
                currentTotal + record.getPoints());

        return isNewRecord;
    }

    public int getTotalPoints(String studentId) {
        return totalPointsByStudent.getOrDefault(studentId, 0);
    }

    public int getRecordCount() {
        return recordsById.size();
    }
}

