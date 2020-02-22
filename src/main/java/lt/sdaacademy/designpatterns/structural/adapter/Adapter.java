package lt.sdaacademy.designpatterns.structural.adapter;

public class Adapter {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round jole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquerePegAdapter smallSqPegAdapter = new SquerePegAdapter(smallSqPeg);
        SquerePegAdapter largeSqPegAdapter = new SquerePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits to round hole r5");
        }
        if (!hole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5");
        }
    }
}
