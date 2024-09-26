package org.example.practice.meetups.oop.extendscar;

public class SportCar extends AbstractCar {

  private String nameDriver;

  public SportCar(String model, String color, int yearOfProduction, String nameDriver) {
    super(model, color, yearOfProduction);
    this.nameDriver = nameDriver;
  }

  void skid() {
    System.out.println("Машину заносит на высокой скорости");
  }

  @Override
  void drive() {
    System.out.println("Движение спортивного автомобиля, модель: " + model);
  }

  @Override
  void openTheDoor() {
    System.out.println("Автомобиль 2-х дверный");
  }

  @Override
  void brake() {
    System.out.printf("Торможение спортивного автомобиля: %s - резкое%n", model);
  }
  @Override
  public String toString() {
    return "SportCar{" +
        "nameDriver='" + nameDriver + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}