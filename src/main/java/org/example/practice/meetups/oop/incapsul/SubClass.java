package org.example.practice.meetups.oop.incapsul;

public class SubClass extends AccessModifierDemo {

  public void accessFields() {
    System.out.println(publicField); // Доступно
    System.out.println(protectedField); // Доступно
    // System.out.println(privateField); // Ошибка: privateField недоступно
    System.out.println(defaultField); // Доступно, так как в одном пакете
  }
}
