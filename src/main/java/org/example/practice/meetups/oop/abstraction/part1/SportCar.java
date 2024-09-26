package org.example.practice.meetups.oop.abstraction.part1;

public class SportCar extends AbstractCar {

  public SportCar(String model, String color, int yearOfProduction) {
    super(model, color, yearOfProduction);
  }

  void skid() {
    System.out.println("Машину заносит на высокой скорости");
  }

  @Override
  void drive() {
    System.out.println("Движение спортивного автомобиля");
  }

  @Override
  void openTheDoor() {
    System.out.println("2-х дверный автомобиль");
  }

  @Override
  void brake() {
    System.out.println("Торможение спортивного автомобиля");
  }

  @Override
  public String toString() {
    return "SportCar{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}
