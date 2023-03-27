import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNumber = randomNumberGeneration();
        clear();
        while (true) {
            if (!checkAttempts(player1) || !checkAttempts(player2)
                    || !isGuessed(player1, targetNumber) || !isGuessed(player2, targetNumber)) {
                break;
            }
        }
        print();
    }

    public int randomNumberGeneration() {
        Random random = new Random();
        return random.nextInt((100) + 1);
    }

    public void clear() {
        player1.clearInputNumbers();
        player2.clearInputNumbers();
    }

    public boolean checkAttempts(Player player) {
        if (player.getNumberAttempts() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    public boolean isGuessed(Player player, int targetNumber) {
        int playerNumber = inputNumber(player);
        player.addNumber(playerNumber);
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + player.getNumberAttempts() + " попытки");
            return false;
        }
        answerResult(playerNumber, targetNumber);
        return true;
    }

    public void answerResult(int playerNumber, int targetNumber) {
        String answer = (playerNumber > targetNumber) ? "число " + playerNumber +
                " больше того, что загадал компьютер" : "число " + playerNumber +
                " меньше того, что загадал компьютер";
        System.out.println(answer);
    }

    public void print() {
        printInputNumbers(player1);
        printInputNumbers(player2);
    }

    public int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        return scanner.nextInt();
    }

    public void printInputNumbers(Player player) {
        int[] copyArray = player.copyPart();
        System.out.print(player.getName() + " : ");
        for (int j : copyArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}