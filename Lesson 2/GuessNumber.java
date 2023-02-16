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
        int max = 101;
        int min = 1;
        int targetNum = random.nextInt(max - min) + min;
        
        while (true) {
            int PlayerNum = 0;
            System.out.println("Первый игрок " + player1.getName() + " введите число ");
            PlayerNum = scanner.nextInt();
            if (PlayerNum == targetNum) {
                System.out.println("Вы победили! Число загаданное компьютером = " + targetNum);
                break;
            }
            if (PlayerNum > targetNum) {
                System.out.println("число " + PlayerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + PlayerNum + " меньше того, что загадал компьютер");
            }

            System.out.println("Второй игрок " + player2.getName() + " введите число ");
            PlayerNum = scanner.nextInt();
            if (PlayerNum == targetNum) {
                System.out.println("Вы победили! Число загаданное компьютером = " + targetNum);
                break;
            }
            if (PlayerNum > targetNum) {
                System.out.println("число " + PlayerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + PlayerNum + " меньше того, что загадал компьютер");
            }
        }
    }
}
