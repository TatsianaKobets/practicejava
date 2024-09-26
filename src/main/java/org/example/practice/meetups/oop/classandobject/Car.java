package org.example.practice.meetups.oop.classandobject;

public class Car {

  String model;
  String color;
  int yearOfProduction;

  public void drive() {
    System.out.println("Машина едет");
  }

  public void openTheDoor() {
    System.out.println("Дверь машины открыта");
  }

  public void brake() {
    System.out.println("Машина тормозит");
  }

  public void skid() {
    System.out.println("Машину заносит");
  }
}
