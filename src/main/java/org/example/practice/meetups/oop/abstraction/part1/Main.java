package org.example.practice.meetups.oop.abstraction.part1;

public class Main {

  public static void main(String[] args) {
    SportCar myCar = new SportCar("Toyota", "Red", 2020);
    System.out.println("Вывод с помощью метода toString: " + myCar.toString());
    System.out.println("Вывод без метода toString: " + myCar.model + " " + myCar.color +
        " " + myCar.yearOfProduction);
    myCar.drive();
    myCar.openTheDoor();
    myCar.brake();
    myCar.skid();

    OrdinaryCar myCar1 = new OrdinaryCar("Nissan", "Blue", 2021);
    myCar1.drive();
    myCar1.openTheDoor();
    myCar1.brake();

    System.out.println(myCar1.toString());
  }
}
