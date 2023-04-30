package class12;

public class Car {
    // define 5 properties and 3 methods
    String model;
    String make;
    String color;
   int mileage;
   boolean isAutomatic;

   void startCar(){
       System.out.println("Starting "+color+"  "+model+" the car");
   }
   void stopCar(){
       System.out.println("Applying the breaks to stop the car");
   }
   void turn(){
       System.out.println("Turning");
   }
}
