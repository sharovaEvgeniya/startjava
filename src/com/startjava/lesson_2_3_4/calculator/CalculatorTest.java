import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите математическое выражение: ");
            double result = calculator.calculate(scanner.nextLine());
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