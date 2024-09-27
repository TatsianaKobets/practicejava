package org.example.practice.meetups.oop.incapsulation;

public class AccessModifierDemo {

  // Поле с модификатором доступа public
  public String publicField = "Я публичное поле";

  // Поле с модификатором доступа protected
  protected String protectedField = "Я защищенное поле";

  // Поле с модификатором доступа private
  private String privateField = "Я приватное поле";

  // Поле с модификатором доступа по умолчанию (default)
  String defaultField = "Я поле по умолчанию";

  // Публичный метод для демонстрации доступа
  public void displayFields() {
    System.out.println(publicField);
    System.out.println(protectedField);
    System.out.println(privateField);
    System.out.println(defaultField);
  }
}