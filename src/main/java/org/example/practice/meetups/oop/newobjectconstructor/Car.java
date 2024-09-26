package org.example.practice.meetups.oop.newobjectconstructor;

public class Car {

  String model;
  String color;
  int yearOfProduction;

  public Car() {// Конструктор без параметров
  }

  public Car(String model) {// Конструктор с одним параметром
    this.model = model;
    color = "Unknown";
    yearOfProduction = 0;
  }

  public Car(String model, String color) {// Конструктор с двумя параметрами
    this.model = model;
    this.color = color;
    yearOfProduction = 0;
  }


  public Car(String model, String color, int yearOfProduction) {// Конструктор с тремя параметрами
    this.model = model;
    this.color = color;
    this.yearOfProduction = yearOfProduction;
  }

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
