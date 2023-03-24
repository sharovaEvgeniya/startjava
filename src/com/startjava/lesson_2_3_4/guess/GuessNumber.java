
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private  Player player1;
    private  Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNumber = randomNumber();
        clear();
        while (true) {
            if (!checkAttempts(player1) || !checkAttempts(player2)
                    || !guessNumber(player1, targetNumber) || !guessNumber(player2, targetNumber)) {
                break;
            }
        }
        print();
    }

    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(101 - 1) + 1;
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

    public boolean guessNumber(Player player, int targetNumber) {
        int playerNumber = inputNumber(player);
        if (playerNumber == targetNumber) {
            player.addNumber(playerNumber);
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + player.getNumberAttempts() + " попытки");
            return false;
        }
        if (playerNumber > targetNumber) {
            player.addNumber(playerNumber);
            System.out.println("число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            player.addNumber(playerNumber);
            System.out.println("число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return true;
    }

    public void print() {
        player1.printInputNumbers();
        player2.printInputNumbers();
    }

    public int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        return scanner.nextInt();
    }
}