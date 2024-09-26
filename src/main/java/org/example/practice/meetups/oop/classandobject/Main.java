package org.example.practice.meetups.oop.classandobject;

public class Main {

  public static void main(String[] args) {
    System.out.println("ООП - что такое класс и объект");
    Car myCar = new Car();
    myCar.model = "Toyota";
    myCar.color = "Red";
    myCar.yearOfProduction = 2020;

    System.out.println(
        "Наша машина: " + myCar.yearOfProduction + " " + myCar.color + " " + myCar.model);

    System.out.println("Что может наша машина: ");

    myCar.drive();
    myCar.openTheDoor();
    myCar.brake();
    myCar.skid();
  }
}
