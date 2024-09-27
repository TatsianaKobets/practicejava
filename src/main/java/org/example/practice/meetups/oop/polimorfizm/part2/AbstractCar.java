package org.example.practice.meetups.oop.polimorfizm.part2;

abstract class AbstractCar {

  String model;
  String color;
  int yearOfProduction;

  public AbstractCar(String model, String color, int yearOfProduction) {
    this.model = model;
    this.color = color;
    this.yearOfProduction = yearOfProduction;
  }

  abstract void drive();

  abstract void openTheDoor();

  abstract void brake();

  abstract void refuel(String fuelType); // Абстрактный метод для заправки

}
