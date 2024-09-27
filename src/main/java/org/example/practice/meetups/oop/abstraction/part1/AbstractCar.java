package org.example.practice.meetups.oop.abstraction.part1;

abstract class AbstractCar {

  String model;
  String color;
  int yearOfProduction;

  protected AbstractCar(String model, String color, int yearOfProduction) {
    this.model = model;
    this.color = color;
    this.yearOfProduction = yearOfProduction;
  }

  abstract void drive();

  abstract void openTheDoor();

  abstract void brake();
}
