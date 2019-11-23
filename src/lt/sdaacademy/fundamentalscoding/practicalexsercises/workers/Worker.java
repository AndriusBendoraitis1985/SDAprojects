package lt.sdaacademy.fundamentalscoding.practicalexsercises.workers;

public class Worker {
    private String name;
    private int salary;
    private int age;
    private String gender;

    public Worker(String name, int salary, int age, String gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
