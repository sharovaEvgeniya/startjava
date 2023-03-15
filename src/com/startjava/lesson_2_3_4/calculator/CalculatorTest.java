import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scanner.nextLine();
            String[] mathematicalExpressionArray = mathematicalExpression.split(" ");
            int num1 = Integer.parseInt(mathematicalExpressionArray[0]);
            int num2 = Integer.parseInt(mathematicalExpressionArray[2]);
            char sign = mathematicalExpressionArray[1].charAt(0);
            double result = calculator.calculate(num1, sign, num2);
            if (result % 1 == 0) {
                System.out.println("Результат : " + (int) result);
            } else {
                System.out.printf("Результат : %.3f", result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}