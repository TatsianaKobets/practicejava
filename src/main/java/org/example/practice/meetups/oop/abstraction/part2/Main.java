package org.example.practice.meetups.oop.abstraction.part2;


public class Main {

  public static void main(String[] args) {

    SportCar myCar = new SportCar("Toyota", "Red", 2020, "Alex");

    myCar.drive();
    myCar.openTheDoor();
    myCar.brake();
    myCar.skid();
    System.out.println(myCar.model + " " + myCar.color + " " + myCar.yearOfProduction + " " + myCar.nameDriver);
    System.out.println(myCar.toString());

    HardCar myCar1 = new HardCar("Nissan", "Blue", 2021);

    myCar1.drive();
    myCar1.openTheDoor();
    myCar1.brake();
    myCar1.ladle();
    System.out.println(myCar1.model + " " + myCar1.color + " " + myCar1.yearOfProduction);
    System.out.println(myCar1.toString());
  }
}
