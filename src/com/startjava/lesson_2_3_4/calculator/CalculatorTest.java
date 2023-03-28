package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    outputsResult(result);
                } catch (ArithmeticException e) {
                    System.out.println("Введите положительные числа");
                } catch (NumberFormatException e) {
                    System.out.println("Введите целые числа");
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    public static void outputsResult(double result) {
        String output = (result % 1 == 0) ? "Результат : " + (int) result : "Результат : " + result;
        System.out.println(output);
    }
}