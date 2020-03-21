package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

import java.util.HashMap;
import java.util.Map;

public enum MotorcycleShapeEnumClass {
    Chopper ("chopper"),
    Cruiser ("cruiser"),
    Enduro ("enduro");

    private final String motorcycleShape;
    private static Map<String, MotorcycleShapeEnumClass> enumByMotorcycleShape = new HashMap<>();

    static {
        for (MotorcycleShapeEnumClass enumValue : values()) {
            enumByMotorcycleShape.put(enumValue.motorcycleShape, enumValue);
        }
    }

    MotorcycleShapeEnumClass(String motorcycleShape) {
        this.motorcycleShape = motorcycleShape;
    }

    public static MotorcycleShapeEnumClass getCarShapeByShapeName (String motorcycleShape){
        return enumByMotorcycleShape.get(motorcycleShape);
    }
}
