package org.example.practice.meetups.oop.extendscar;

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

}
