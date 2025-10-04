class Car {
   // ATTRIBUTES OF CLASS
   /*String make = "Ford"; 
   String model = "Mustang";
   int year = 2025;
   double price = 78000.99;
   boolean isRunning = false;


   //METHODS OF CLASS
   void start(){
      System.out.println("You start the engine");

   }
   void stop(){
      System.out.println("You stop the engine");
   }*/

   String model;
   String color;

   Car(String model, String color){
      this.model = model;
      this.color = color;
   }

   void drive(){
      System.out.println("You drive the " + this.color + " "+ this.model);
   }

}
public class Careg{

    public static void main(String[] args){
    //Onject = An entity that holds data(attributes) & can perform actions(methods),It is reference data type
    
     
    /*  Car car = new Car();

     car.make = "BMW";
     System.out.println(car.make);
     System.out.println(car.model);
     car.stop();*/

     Car c1 = new Car("BMW","Blue");
     
     
     Car[] cars = {c1,new Car("Mustang","Red")};  //Array of objects either use objects or anonymus objects within array

     for(Car c : cars){
      c.drive();
     }
     




    }}
