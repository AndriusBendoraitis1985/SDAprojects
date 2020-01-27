package lt.sdaacademy.advancefeatures.annotations.supresswarnings;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main (String [] args){

        addWordIntoList(Arrays.asList());
    }

    @SuppressWarnings("unchecked") //kai uzkomentuota, tada mes gitbash klaida.
    private static void addWordIntoList(List inputList){ //reikia paleisti per GitBasch javac Example.java. projekto direktorijoje
        List<String> list = (List<String>) inputList;
    }
    // TODO come back later and check in internet what is aproblem, why do not work with gitbash "javac Example.java
}
