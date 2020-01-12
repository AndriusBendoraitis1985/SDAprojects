package lt.sdaacademy.advancefeatures.inheritance.abstractexample.animal;

public abstract class Animal {

    protected boolean mammal;
    protected String voice;

    public Animal (boolean mammal, String voice){
        this.mammal=mammal;
        this.voice=voice;
    }

    public String yieldVoice (){
        return String.format("My voice is: "+ voice + ". Am I mammal: "+ mammal);
    }

}
