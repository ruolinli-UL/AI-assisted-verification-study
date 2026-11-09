public final class PointsRecord {
    private final String recordId;
    private final String studentId;
    private final int points;

    public PointsRecord(String recordId, String studentId, int points) {
        this.recordId = recordId;
        this.studentId = studentId;
        this.points = points;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getPoints() {
        return points;
    }
}

