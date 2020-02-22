package lt.sdaacademy.designpatterns.creational.builder.example;

public class Pizza {

    private final String name;
    private final int size;

    private final boolean isAddCheese;
    private final boolean isAddSause;
    private final boolean isTakeAway;


    public String getName(){
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isAddCheese() {
        return isAddCheese;
    }

    public boolean isAsAddSause() {
        return isAddSause;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    @Override
    public String toString() {
        return "Pizza= " +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isAddCheese=" + isAddCheese +
                ", asAddSause=" + isAddSause +
                ", isTakeAway=" + isTakeAway +
                '}';
    }

    private Pizza (PizzaBuilder builder){
        this.name = builder.name;
        this.size= builder.size;
        this.isAddCheese = builder.isAddCheese;
        this.isAddSause=builder.isAddSause;
        this.isTakeAway=builder.isTakeAway;
    }

    public static class PizzaBuilder {
        private String name;
        private int size;

        private boolean isAddCheese;
        private  boolean isAddSause;
        private  boolean isTakeAway;

        public PizzaBuilder (String name, int size){
            this.name = name;
            this.size = size;
        }

        public PizzaBuilder AddCheese (boolean isAddCheese){
            this.isAddCheese=isAddCheese;
            return this;
        }
        public PizzaBuilder AddSauce (boolean isAddSause){
            this.isAddSause=isAddSause;
            return this;
        }
        public PizzaBuilder TakeAway (boolean isTakeAway){
            this.isTakeAway=isTakeAway;
            return this;
    }
    public Pizza build (){
        return new Pizza(this);
        }
    }
}
