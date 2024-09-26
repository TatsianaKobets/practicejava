package org.example.practice.meetups.oop.incapsul;

public class Main {

  public static void main(String[] args) {

  // Создание экземпляра класса Person
  Person person = new Person("Alice", 30);
  //person.name = "Charlie"

  // Выводим исходные значения
        System.out.println("Имя: "+person.getName());
        System.out.println("Возраст: "+person.getAge());

  // Изменяем имя и возраст
        person.setName("Bob");
        person.setAge(35);

  // Выводим измененные значения
        System.out.println("Измененное имя: "+person.getName());
        System.out.println("Измененный возраст: "+person.getAge());

  // Пробуем установить отрицательный возраст
        person.setAge(-5); // Это не должно изменить возраст
        System.out.println("Попытка установить отрицательный возраст: "+person.getAge());
}
}
