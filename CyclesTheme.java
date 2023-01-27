public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int count = -10;
        int sumEven = 0;
        int sumUneven = 0;

        do {
            if(count < 0) {
                sumUneven += count;
                count++;
            } else {
                sumEven += count;
                count++;
            }
        } while (count <= 21);

        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven 
                + ", а нечетных = " + sumUneven);


        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num1;
        int minNum = num2;

        if(num2 > maxNum) {
            maxNum = num2;
        } else if(num3 > maxNum) {
            maxNum = num3;
        } else if(num1 < minNum) {
            minNum = num1;
        } else if(num3 < minNum) {
            minNum = num3;
        }

        System.out.println("все числа в интервале (" + minNum + ", " + maxNum 
                + ") в порядке убывания");

        for(int i = (maxNum - 1) ; i > minNum; i--) {
            System.out.print(i + " ");
        }


        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sumNumber = 0;
        int reversNumber = 0;
        int del = 1000;

        while(number != 0) {
            reversNumber = (reversNumber * 10) + number % 10;
            sumNumber += (number % 10);
            number /= 10;
        }

        System.out.println("исходное число в обратном порядке - " + reversNumber 
                + "\nсумма его цифр - " + sumNumber);


        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int minInterval = 1;
        int maxInterval = 24;
        int numberOfDigits = 0;

        for(int i = minInterval; i <= maxInterval; i += 2) {
            System.out.printf("%2s ", i);
            numberOfDigits++;
            if(numberOfDigits == 5) {
                numberOfDigits = 0;
                System.out.println();
            }
        }

        if(numberOfDigits > 0) {
            for(int i = 0; i < (5 - numberOfDigits); i++) {
                System.out.printf("%2s ", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        int number1 = 3242592;
        int numberOfTwos = 0;

        System.out.print("число " + number1);

        while(number1 > 0) {
            if((number1 % 10) == 2) {
                numberOfTwos++;
            }
            number1 /= 10;
        }

        if(numberOfTwos % 2 == 0) {
            System.out.print(" содержит " + numberOfTwos 
                    + " (четное) количество двоек");
        } else {
            System.out.print(" содержит " + numberOfTwos 
                    + " (нечетное) количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n");

        int numberOfColumns = 5;
        int numberOfRows = numberOfColumns;

        while(numberOfColumns > 0) {
            numberOfRows = numberOfColumns;
            while(numberOfRows > 0) {
                System.out.print("#");
                numberOfRows--;
            }
            System.out.println("");
            numberOfColumns--;
        }

        System.out.println("\n");

        int numberOfSymbolPerLine = 1;
        int numberOfLines = 1;
        int counter = 1;

        do {
            numberOfSymbolPerLine = 1;
            do {
                System.out.print("$");
                numberOfSymbolPerLine++;
            } while (numberOfSymbolPerLine <= counter);
            System.out.println();
            numberOfLines++;
            if (numberOfLines <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (numberOfLines <= 5);

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

        while(numOriginal != 0) {
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
        int firstHalfOfNumber = numLucky / 1000;
        int secondHalfOfNumber = numLucky % 1000;

        while (numLucky != 0) {
            if(countLucky < 3) {
            secondSumLucky += (numLucky % 10);
            countLucky++;
            numLucky /= 10;
            } else {
                firstSumLucky += (numLucky % 10);
                numLucky /= 10;
            }
        }

        System.out.println("сумма цифр " + firstHalfOfNumber + " = " + firstSumLucky);
        System.out.println("сумма цифр " + secondHalfOfNumber + " = " + secondSumLucky);

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
            System.out.println("");
        }
    }
}