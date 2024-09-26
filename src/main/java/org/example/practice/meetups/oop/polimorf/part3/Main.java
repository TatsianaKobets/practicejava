package org.example.practice.meetups.oop.polimorf.part3;

public class Main {

  public static void main(String[] args) {

    SportCar sportCar = new SportCar("BMW", "Black", 2018, "Alex");
    System.out.println("Car: " + sportCar.toString());
    sportCar.drive();
    sportCar.openTheDoor();
    sportCar.brake();
    sportCar.refuel("бензином");
    sportCar.refuel(20); // вызов перегруженного метода
    sportCar.refuel(); // вызов метода по умолчанию
    sportCar.skid();

    OrdinaryCar ordinaryCar = new OrdinaryCar("Mercedes", "White", 2017, "Katty");
    System.out.println("\nCar: " + ordinaryCar.toString());
    ordinaryCar.drive();
    ordinaryCar.openTheDoor();
    ordinaryCar.brake();
    ordinaryCar.refuel("электричеством");
    ordinaryCar.refuel(15); // вызов перегруженного метода
    ordinaryCar.refuel(); // вызов метода по умолчанию
  }
}
