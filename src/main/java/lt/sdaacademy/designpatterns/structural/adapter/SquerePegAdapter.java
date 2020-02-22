package lt.sdaacademy.designpatterns.structural.adapter;

public class SquerePegAdapter extends RoundPeg{

    private SquarePeg peg;

    public SquerePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    @Override
    public double getRadius(){
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth()/2),2)*2));
        return result;
    }
}
