package org.example.practice.meetups.oop.abstraction.part2;

public class SportCar extends Car implements Vehicle {

  public String nameDriver;

  public SportCar(String model, String color, int yearOfProduction, String nameDriver) {
    super(model, color, yearOfProduction);
    this.nameDriver = nameDriver;
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

  @Override
  public void drive() {
    System.out.println("Движение спортивного автомобиля: " + model);
  }

  @Override
  public void openTheDoor() {
    System.out.println("2-х дверные автомобиль: " + model);
  }

  @Override
  public void brake() {
    System.out.println("Торможение спортивного автомобиля: " + model);
  }

  @Override
  public void skid() {
    System.out.println("Машину заносит на высокой скорости");
  }

  public void playMusic() {
    System.out.println("Автомобиль " + model + " играет музыку");
  }

}
