package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods;

public class Product {

    int cod;
    String name;
    int price;
    String size;

    public Product(int cod, String name, int price, String size) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public int getCod() {
        return cod;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Code= " + cod +
                ", name= " + name +
                ", price= " + price +
                ", size= " + size +" ";
    }
}
