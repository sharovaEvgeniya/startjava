import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.play();
        String answer = "yes";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                guessNumber.play();
            }
        } while (!answer.equals("yes") && !answer.equals("no"));
    }
}