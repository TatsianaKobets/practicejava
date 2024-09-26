package org.example.practice.meetups.oop.abstraction.part1;

public class OrdinaryCar extends AbstractCar {

  public OrdinaryCar(String model, String color, int yearOfProduction) {
    super(model, color, yearOfProduction);
  }

  @Override
  void drive() {
    System.out.println("Движение обычного автомобиля");
  }

  @Override
  void openTheDoor() {
    System.out.println("5-и дверный автомобиль");
  }

  @Override
  void brake() {
    System.out.println("Торможение обычного автомобиля");
  }

  @Override
  public String toString() {
    return "OrdinaryCar{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}
