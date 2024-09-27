package org.example.practice.meetups.oop.polimorfizm.part2;

public class Main {

  public static void main(String[] args) {

    SportCar sportCar = new SportCar("BMW", "Black", 2018, "Alex");
    System.out.println("Car: " + sportCar.toString());
    sportCar.drive();
    sportCar.openTheDoor();
    sportCar.brake();
    sportCar.refuel("бензином");
    sportCar.skid();

    OrdinaryCar ordinaryCar = new OrdinaryCar("Mercedes", "White", 2017, "Katty");
    System.out.println("\nCar: " + ordinaryCar.toString());
    ordinaryCar.drive();
    ordinaryCar.openTheDoor();
    ordinaryCar.brake();
    ordinaryCar.refuel("электричеством");
  }
}
