package lt.sdaacademy.designpatterns.behavioral.visitor.example;

public class Computer implements Item {

    private String ram;
    private String hdd;
    private String cpu;
    private int price;

    public Computer(String ram, String hdd, String cpu, int price){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.price = price;
    }

    public String getRam(){
        return ram;
    }

    public String getHdd(){
        return hdd;
    }

    public String getCpu(){
        return cpu;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}