import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                double result = Calculator.calculate(scanner.nextLine());
                outputsResult(result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    public static void outputsResult(double result) {

        if (result % 1 == 0) {
            System.out.println("Результат : " + (int) result);
        } else {
            System.out.printf("Результат : %.3f", result);
        }
    }
}