package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

import java.util.HashMap;
import java.util.Map;

public enum CarTransmissionEnumClass {
    Manual("manual"),
    Automatic("automatic");

    private final String carTransmissionType;
    private static Map<String, CarTransmissionEnumClass> enumByCarTransmissionType = new HashMap<>();

    static{
        for (CarTransmissionEnumClass enumValue: values()) {
            enumByCarTransmissionType.put(enumValue.carTransmissionType, enumValue);
        }
    }

    CarTransmissionEnumClass(String carTransmissionType) {
        this.carTransmissionType = carTransmissionType;
    }
    public static CarTransmissionEnumClass getCarShapeByShapeName (String carTransmission){
        return enumByCarTransmissionType.get(carTransmission);
    }
}
