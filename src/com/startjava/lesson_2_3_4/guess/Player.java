package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] inputNumbers = new int[10];
    private int numberAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getInputNumbers() {
        return Arrays.copyOf(inputNumbers, numberAttempts);
    }

    public void addNumber(int number) {
        inputNumbers[numberAttempts] = number;
        numberAttempts++;
    }

    public int getNumberAttempts() {
        return numberAttempts;
    }


    public void clear() {
        Arrays.fill(inputNumbers, 0, numberAttempts, 0);
        numberAttempts = 0;
    }
}