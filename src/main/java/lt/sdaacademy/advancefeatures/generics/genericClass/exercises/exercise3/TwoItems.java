package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise3;

/*Sukurti klasę `TwoItems`, kuri viduje turi 2 kintamuosius (entry1 ir entry2)
        ir geterius jų reikšmėms gauti, bei toString() metodą.
        Išmėginti inicializuojant klasę su sveikais skaičiais ir tekstinio formato duomenimis.*/

public class TwoItems<N> {

    private N entry1;
    private N entry2;

    public TwoItems(N entry1, N entry2) {
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public N getEntry1() {
        return entry1;
    }

    public N getEntry2() {
        return entry2;
    }

    @Override
    public String toString() {
        return "entry1=" + entry1 + ", entry2=" + entry2;
    }
}


