package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        targetNumber = generateRandomNumber();
        clear();
        do {
            if (!isGuessed(player1) || !isGuessed(player2)) {
                break;
            }
        } while (checkAttempts(player1) || checkAttempts(player2));
        print();
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt((100) + 1);
    }

    private void clear() {
        player1.clear();
        player2.clear();
    }

    private boolean checkAttempts(Player player) {
        if (player.getNumberAttempts() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    private boolean isGuessed(Player player) {
        int playerNumber = inputNumber(player);
        player.addNumber(playerNumber);
        if (playerNumber == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + player.getNumberAttempts() + " попытки");
            return false;
        }
        String answer = (playerNumber > targetNumber) ? playerNumber + " больше " : playerNumber + " меньше ";
        System.out.println("число " + answer + "того, что загадал компьютер");
        return true;
    }

    private int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        return scanner.nextInt();
    }

    private void print() {
        printInputNumbers(player1);
        printInputNumbers(player2);
    }

    private void printInputNumbers(Player player) {
        int[] copyInputNumbers = player.getInputNumbers();
        System.out.print(player.getName() + " : ");
        for (int inputNumber : copyInputNumbers) {
            System.out.print(inputNumber + " ");
        }
        System.out.println();
    }
}
