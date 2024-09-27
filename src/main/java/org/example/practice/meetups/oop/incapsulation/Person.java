package org.example.practice.meetups.oop.incapsulation;

public class Person {

  // Приватные поля
  private String name;
  private int age;

  // Публичный конструктор
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Геттер для имени
  public String getName() {
    return name;
  }

  // Сеттер для имени
  public void setName(String name) {
    this.name = name;
  }

  // Геттер для возраста
  public int getAge() {
    return age;
  }

  // Сеттер для возраста
  public void setAge(int age) {
    if (age >= 0) { // Проверка на отрицательный возраст
      this.age = age;
    } else {
      System.out.println("Возраст не может быть отрицательным!");
    }
  }
}
