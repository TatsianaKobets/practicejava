package org.example.practice.kata;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String modifiedText = textModifier();
    System.out.println(modifiedText);
  }

  public static String textModifier() {
    Scanner scanner = new Scanner(System.in);
    String inputText = scanner.nextLine();
    StringBuilder result = new StringBuilder();
    int digitSum = 0;

    // 1. Удаление лишних пробелов
    boolean isPreviousSpace = false;
    for (char c : inputText.toCharArray()) {
      if (c == ' ') {
        if (!isPreviousSpace) {
          result.append(c);
          isPreviousSpace = true;
        }
      } else {
        result.append(c);
        isPreviousSpace = false;
      }
    }

    String intermediateText = result.toString();
    result.setLength(0); // Очищаем StringBuilder для следующей операции

    // 2. Обработка знаков минус (-)
    for (int i = 0; i < intermediateText.length(); i++) {
      char c = intermediateText.charAt(i);
      if (c == '-') {
        if (i > 0 && i < intermediateText.length() - 1) {
          // Меняем местами символы слева и справа от знака минус
          char leftChar = intermediateText.charAt(i - 1);
          char rightChar = intermediateText.charAt(i + 1);
          result.setCharAt(result.length() - 1, rightChar);
          result.append(leftChar);
          i++; // Пропускаем следующий символ
        }
      } else {
        result.append(c);
      }
    }

    String textAfterMinus = result.toString();
    result.setLength(0); // Очищаем StringBuilder для следующей операции

    // 3. Замена знака плюс (+) на восклицательный знак (!)
    for (char c : textAfterMinus.toCharArray()) {
      if (c == '+') {
        result.append('!');
      } else {
        result.append(c);
      }
    }

    String textAfterPlus = result.toString();
    result.setLength(0); // Очищаем StringBuilder для следующей операции

    // 4. Суммирование цифр и удаление их из текста
    for (char c : textAfterPlus.toCharArray()) {
      if (Character.isDigit(c)) {
        digitSum += Character.getNumericValue(c);
      } else {
        result.append(c);
      }
    }

    // Формируем конечный результат
    String finalResult = result.toString();
    if (digitSum > 0) {
      finalResult += " " + digitSum; // Добавляем пробел перед суммой если сумма больше 0
    }

    return finalResult.trim(); // Убираем возможные пробелы в начале или конце
  }
}