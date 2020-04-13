package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods;

public class Coin {

    int cod;
    int value;

    public Coin(int cod, int value) {
        this.cod = cod;
        this.value = value;
    }

    public int getCod() {
        return cod;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "code= " + cod +
                ", value= " + value +
                " ";
    }
}
