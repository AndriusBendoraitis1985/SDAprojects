package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

import java.util.HashMap;
import java.util.Map;

public enum CarShapeEnumClass {
    Coupe("coupe"),
    Sedan("sedan"),
    Wagon("wagon");

    private final String carShape;
    private static Map<String, CarShapeEnumClass> enumByCarShape = new HashMap<>();

    static {
        for (CarShapeEnumClass enumValue : values()) {
            enumByCarShape.put(enumValue.carShape, enumValue);
        }
    }
    CarShapeEnumClass(String carShape) {
        this.carShape = carShape;
    }
    public static CarShapeEnumClass getCarShapeByShapeName (String carShape){
            return enumByCarShape.get(carShape);
    }
}
