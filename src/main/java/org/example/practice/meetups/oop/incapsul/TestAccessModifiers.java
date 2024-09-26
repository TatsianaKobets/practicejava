package org.example.practice.meetups.oop.incapsul;

public class TestAccessModifiers {

  public static void main(String[] args) {
    AccessModifierDemo demo = new AccessModifierDemo();

    // Доступ к полям из другого класса
    System.out.println(demo.publicField); // Доступно
    // System.out.println(demo.protectedField); // Ошибка: protectedField недоступно
    // System.out.println(demo.privateField); // Ошибка: privateField недоступно
    // System.out.println(demo.defaultField); // Ошибка: defaultField недоступно

    demo.displayFields(); // Показать все поля

    // Создание экземпляра подкласса
    SubClass subClass = new SubClass();
    subClass.accessFields(); // Доступ к полям в подклассе
  }
}
