package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int count = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if(count % 2 == 0) {
                sumEven += count;
            } else if(count % 2 != 0){
                sumOdd += count;
            }
            count++;
        } while (count <= 21);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven 
                + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 5;
        int num2 = -1;
        int num3 = 10;
        int max = num1;
        int min = num1;

        if(num2 > max) {
            max = num2;
        } else if(num2 < min) {
            min = num2;
        }

        if(num3 > max) {
            max = num3;
        } else if(num3 < min) {
            min = num3;
        }

        System.out.println("все числа в интервале (" + min + ", " + max 
                + ") в порядке убывания");

        for(int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sumDigits = 0;

        System.out.print("исходное число в обратном порядке - ");

        while(num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            sumDigits += digit;
            num /= 10;
        }

        System.out.println("\nсумма его цифр - " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int startInterval = 1;
        int endInterval = 24;
        int numDigits = 0;

        for(int i = startInterval; i <= endInterval; i += 2) {
            if(numDigits == 5) {
                numDigits = 0;
                System.out.println();
            }
            System.out.printf("%2s ", i);
            numDigits++;
        }

        if(numDigits > 0) {
            for(int i = 0; i < (5 - numDigits); i++) {
                System.out.printf("%2s ", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        int num4 = 3242592;
        int numTwos = 0;

        System.out.print("число " + num4);

        while(num4 > 0) {
            if((num4 % 10) == 2) {
                numTwos++;
            }
            num4 /= 10;
        }

        System.out.print(" сoдержит " + numTwos);

        if(numTwos % 2 == 0) {
            System.out.print(" (четное)");
        } else {
            System.out.print(" (нечетное)");
        }

        System.out.print(" количество двоек");

        System.out.println("\n\n6. Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        int numOfColumns = 5;
        int numOfRows = numOfColumns;

        while(numOfColumns > 0) {
            numOfRows = numOfColumns;
            while(numOfRows > 0) {
                System.out.print("#");
                numOfRows--;
            }
            System.out.println();
            numOfColumns--;
        }

        System.out.println("\n");

        numOfColumns = 1;
        numOfRows = 1;
        int counter = 1;

        do {
            numOfColumns = 1;
            do {
                System.out.print("$");
                numOfColumns++;
            } while (numOfColumns <= counter);
            System.out.println();
            numOfRows++;
            if (numOfRows <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (numOfRows <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        for(char i = 33; i <= 127; i++) {
            if(i < 48 && i % 2 != 0) {
                System.out.printf("%3d%3c%n", (int) i, i);
            } else if(i > 97 && i < 123 && i % 2 == 0) {
                System.out.printf("%3d%3c%n", (int) i, i);
            }
        }

        System.out.println("\n8. Вывод реверсивного числа и суммы его цифр\n");
        int numOriginal = 1234321;
        int numPalindrome = 0;
        int copyNumOriginal = numOriginal;

        while(numOriginal > 0) {
            numPalindrome = (numPalindrome * 10) + numOriginal % 10;
            numOriginal /= 10;
        }

        if(copyNumOriginal == numPalindrome) {
            System.out.println("число " + copyNumOriginal + " является палиндромом");
        } else {
            System.out.println("число " + copyNumOriginal + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int numLucky = 123321;
        int countLucky = 0;
        int firstSumLucky = 0;
        int secondSumLucky = 0;
        int firstHalfOfNum = numLucky / 1000;
        int secondHalfOfNum = numLucky % 1000;

        while (numLucky != 0) {
            if(countLucky < 3) {
                secondSumLucky += (numLucky % 10);
                countLucky++;
            } else {
                firstSumLucky += (numLucky % 10);
            }
            numLucky /= 10;
        }

        System.out.println("сумма цифр " + firstHalfOfNum + " = " + firstSumLucky);
        System.out.println("сумма цифр " + secondHalfOfNum + " = " + secondSumLucky);

        if(firstSumLucky == secondSumLucky) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.println("   |  2  3  4  5  6  7  8  9\n______________________________" );

        for(int i = 2; i < 10; i++) {
            System.out.print(i + "  |");
            for(int j = 2; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }
}