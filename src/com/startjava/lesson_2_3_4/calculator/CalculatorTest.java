import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите математическое выражение: ");
            Calculator.calculate(scanner.nextLine());
            Calculator.outputsResult();
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}