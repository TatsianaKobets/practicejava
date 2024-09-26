package org.example.practice.meetups.oop.polimorf.part1;

public class PereoprAnimal {

  void makeSound() {
    System.out.println("Животное издает звук");
  }
}

class Dog extends PereoprAnimal {

  @Override
  void makeSound() {
    System.out.println("Собака лает");
  }
}

class Cat extends PereoprAnimal {

  @Override
  void makeSound() {
    System.out.println("Кошка мяукает");
  }

  public static void main(String[] args) {
    PereoprAnimal myDog = new Dog();
    PereoprAnimal myCat = new Cat();

    myDog.makeSound();  // Собака лает
    myCat.makeSound();  // Кошка мяукает
  }
}
