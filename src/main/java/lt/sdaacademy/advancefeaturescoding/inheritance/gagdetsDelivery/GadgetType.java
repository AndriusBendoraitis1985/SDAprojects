package lt.sdaacademy.advancefeaturescoding.inheritance.gagdetsDelivery;

import java.util.HashMap;
import java.util.Map;

public enum GadgetType {
    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER("kompiuteris"),
    MICRO_CONTROLLER("mikro kontroleris");

    private final String gadgetName;

    private static final Map<String,GadgetType> enumByGadgetName = new HashMap<>();

    static {
        for (GadgetType enumValue: values()) {
            enumByGadgetName.put(enumValue.gadgetName, enumValue);
        }
    }

    GadgetType(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public static GadgetType getEnumByGadgetName (String gadgetName){
        return enumByGadgetName.get(gadgetName);
    }
}


