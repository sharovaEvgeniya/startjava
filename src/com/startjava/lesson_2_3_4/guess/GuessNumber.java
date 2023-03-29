package com.startjava.lesson_2_3_4.guess;

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
        int targetNumber = generationRandomNumber();
        clear();
        while (true) {
            if (!checkAttempts(player1) || !checkAttempts(player2)) {
                break;
            }
            if (!isGuessed(player1, targetNumber) || !isGuessed(player2, targetNumber)) {
                break;
            }
        }
        print();
    }

    public int generationRandomNumber() {
        Random random = new Random();
        return random.nextInt((100) + 1);
    }

    public void clear() {
        player1.clear();
        player2.clear();
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
        String answer = (playerNumber > targetNumber) ? playerNumber + " больше " : playerNumber + " меньше ";
        System.out.println("число " + answer + "того, что загадал компьютер");
        return true;
    }

    public int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число");
        return scanner.nextInt();
    }

    public void print() {
        printInputNumbers(player1);
        printInputNumbers(player2);
    }

    public void printInputNumbers(Player player) {
        int[] copyInputNumbers = player.getInputNumbers();
        System.out.print(player.getName() + " : ");
        for (int inputNumber : copyInputNumbers) {
            System.out.print(inputNumber + " ");
        }
        System.out.println();
    }
}
