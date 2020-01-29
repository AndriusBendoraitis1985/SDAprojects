package lt.sdaacademy.fundamentalscoding.practicalexsercises.triangle;

public enum TriangleType {
    EQUILATERAL("lygiakrastis"),
    EQUAL_SIDE("lygiasonis"),
    OBTUSE("bukasis");

    private String triangleDescription;

    TriangleType(String triangleDescription) {
        this.triangleDescription = triangleDescription;
    }

    public String getTriangleDescription() {
        return triangleDescription;
    }


}
