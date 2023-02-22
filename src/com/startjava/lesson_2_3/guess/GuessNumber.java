package com.startjava.lesson_2_3.guess;

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
        int targetNum = random.nextInt(101 - 1) + 1;

        while (true) {
            int playerNum = 0;
            System.out.println("Первый игрок " + player1.getName() + " введите число ");
            playerNum = scanner.nextInt();
            if (playerNum == targetNum) {
                System.out.println("Вы победили! Число загаданное компьютером = " + targetNum);
                break;
            }
            if (playerNum > targetNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            }

            System.out.println("Второй игрок " + player2.getName() + " введите число ");
            playerNum = scanner.nextInt();
            if (playerNum == targetNum) {
                System.out.println("Вы победили! Число загаданное компьютером = " + targetNum);
                break;
            }
            if (playerNum > targetNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            }
        }
    }
}
