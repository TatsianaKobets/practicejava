package org.example.practice.meetups.oop.extendscar;

public class OrdinaryCar extends AbstractCar {

  String nameFamily;

  public OrdinaryCar(String model, String color, int yearOfProduction, String nameFamily) {
    super(model, color, yearOfProduction);
    this.nameFamily = nameFamily;
  }

  void travel() {
    System.out.println("Машина везет на море семью " + nameFamily);
  }

  @Override
  void drive() {
    System.out.println("Движение обычного автомобиля, модель: " + model);
  }

  @Override
  void openTheDoor() {
    System.out.println("Автомобиль 5-и дверный");
  }

  @Override
  void brake() {
   // System.out.println("Торможение обычного автомобиля: " + model + " плавное");
    System.out.printf("Торможение обычного автомобиля:  %s - плавное%n", model);
  }

  @Override
  public String toString() {
    return "OrdinaryCar{" +
        "nameFamily='" + nameFamily + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", yearOfProduction=" + yearOfProduction +
        '}';
  }
}
