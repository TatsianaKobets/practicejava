package org.example.practice.meetups.oop.abstraction.part2;

public class HardCar extends Car implements VehicleHard {

  public HardCar(String model, String color, int yearOfProduction) {
    super(model, color, yearOfProduction);
  }

  @Override
  public void ladle() {
    System.out.println("Работа ковшом");
  }

  @Override
  public void drive() {
    System.out.println("Движение тяжолой техники: " + model);
  }

  @Override
  public void openTheDoor() {
    System.out.println("1 дверь в кабине");
  }

  @Override
  public void brake() {
    System.out.println("Торможение автомобиля");
  }

  @Override
  public void skid() {
    System.out.println("Машину не заносит, она очень тяжелая");
  }

  @Override
  public String toString() {
    return "HardCar{" +
        "model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}
