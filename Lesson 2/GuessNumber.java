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
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numPlayer = 0;
        int numRandom = random.ints(1, 1, 100).sum();
        while (true) {
            System.out.println("Первый игрок " + player1.getName() + " введите число ");
            numPlayer = scanner.nextInt();
            if (numPlayer == numRandom) {
                System.out.println("Вы победили! Число загаданное компьютером = " + numRandom);
                break;
            }
            if (numPlayer > numRandom) {
                System.out.println("число " + numPlayer + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + numPlayer + " меньше того, что загадал компьютер");
            }
            System.out.println("Второй игрок " + player2.getName() + " введите число ");
            numPlayer = scanner.nextInt();
            if (numPlayer == numRandom) {
                System.out.println("Вы победили! Число загаданное компьютером = " + numRandom);
                break;
            }
            if (numPlayer > numRandom) {
                System.out.println("число" + numPlayer + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + numPlayer + " меньше того, что загадал компьютер");
            }
        }
    }
}
