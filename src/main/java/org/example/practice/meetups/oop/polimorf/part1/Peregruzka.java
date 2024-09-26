package org.example.practice.meetups.oop.polimorf.part1;

public class Peregruzka {

  // Перегрузка метода add с двумя параметрами
  public int add(int a, int b) {
    return a + b;
  }

  // Перегрузка метода add с тремя параметрами
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Перегрузка метода add с параметрами типа double
  public double add(double a, double b) {
    return a + b;
  }

    public static void main(String[] args) {
      Peregruzka math = new Peregruzka();

      System.out.println("Сумма двух целых: " + math.add(5, 10));                // 15
      System.out.println("Сумма трех целых: " + math.add(5, 10, 15));          // 30
      System.out.println("Сумма двух дробных: " + math.add(5.5, 10.5));        // 16.0
  }
}
