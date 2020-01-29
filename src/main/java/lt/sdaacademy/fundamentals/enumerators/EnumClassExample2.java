package lt.sdaacademy.fundamentals.enumerators;

public enum EnumClassExample2 {
   AUDI(2,"audi",true),
    VW(2,"vokswagen",false),
    TOYOTA(1,"toyota",true),
    BMW(3,"beemer",false);

   private final int engineSize;
   private final String carName;
   private final boolean runAndDrive;

   EnumClassExample2 (int engineSize,String carName, boolean runAndDrive){
       this.engineSize = engineSize;
       this.carName = carName;
       this.runAndDrive =runAndDrive;
   }

   public int getEngineSize(){
       return this.engineSize;
   }
   public String getCarName(){
       return this.carName;
   }
   public boolean isRunAndDrive(){
       return this.runAndDrive;
   }

}
