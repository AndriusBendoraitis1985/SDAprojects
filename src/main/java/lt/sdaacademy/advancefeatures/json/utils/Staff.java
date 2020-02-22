package lt.sdaacademy.advancefeatures.json.utils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Staff {
    private String name;
    private int age;
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;

    public Staff (String name, int age, String[] position, List<String> skills, Map<String, BigDecimal> salary){
        this.name=name;
        this.age=age;
        this.position=position;
        this.skills=skills;
        this.salary=salary;
    }
    public static Staff buildStaff(){
        return new Staff("George", 24, new String[]{"CTO", "Founder", "Director"}, Arrays.asList("Java", "Kotlil","Python", "JS"), new HashMap<>());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
