package org.example.practice.meetups.oop.newobjectconstructor;

public class Main {

  public static void main(String[] args) {
    System.out.println("Создание объекта и использование конструктора");
    Car myCar = new Car("Toyota", "Red", 2020);// использование конструктора
    /*Car myCar = new Car();
    myCar.model = "Toyota";
    myCar.color = "Red";
    myCar.yearOfProduction = 2020;*/
    myCar.drive();

    System.out.println("Cоздание объекта со всеми параметрами");
    System.out.println("Наша машина со всеми параметрами: "
        + myCar.yearOfProduction + " " + myCar.color + " " + myCar.model);

    System.out.println("Создание объекта с одним параметром");
    Car myCarOneParam = new Car("Nissan");
    System.out.println("Наша машина с одним параметром: " + myCarOneParam.model);

  }
}
