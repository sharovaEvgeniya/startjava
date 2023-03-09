import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbersArr = {4, 1, 5, 2, 7, 3, 6};
        int length = numbersArr.length;

        System.out.print("Массив до модификации :");
        printNumbersArray(numbersArr);

        for (int i = 0; i < length / 2; i++) {
            int temp = numbersArr[i];
            numbersArr[i] = numbersArr[length - 1 - i];
            numbersArr[length - 1 - i] = temp;
        }

        System.out.print("\nМассив после модификации :");
        printNumbersArray(numbersArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numbers = new int[10];
        length = numbers.length;

        for (int i = 0; i < length; i++) {
            numbers[i] = i;
        }

        int sumArr = 1;
        for (int i = 1; i < length - 1; i++) {
            sumArr *= numbers[i];
            System.out.print(numbers[i] + (i != length - 2 ? " * " : " = " + sumArr));
        }
        System.out.println("\n" + numbers[0] + " и " + numbers[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;

        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }

        System.out.println("Исходный массив :");
        printDoubleArray(doubleArr);

        int count = 0;
        double middleCell = doubleArr[length / 2];

        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleCell) {
                doubleArr[i] = 0;
                count++;
            }
        }

        System.out.println("\nИзмененный массив :");
        printDoubleArray(doubleArr);

        System.out.println("\nКоличество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charsArr = new char[26];
        length = charsArr.length;
        char capitalLetter = 'Z';

        for (int i = 0; i < length; i++) {
            charsArr[i] = capitalLetter;
            for (int j = 0; j <= i; j++) {
                System.out.print(charsArr[j]);
            }
            System.out.println();
            capitalLetter--;
        }

        System.out.println("\n5. Генерация уникальных чисел");
        numbers = new int[30];
        length = numbers.length;
        int randomNumber;
        for (int i = 0; i < length; i++) {
            do {
                randomNumber = (int) (Math.random() * 40 + 60);
            } while (equalsElement(randomNumber, numbers));
            numbers[i] = randomNumber;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < length; i++) {
            System.out.printf(numbers[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }
        System.out.println("\n6. Копирование не пустых строк");
        String[] stringArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = stringArray.length;
        int lengthNewArray = 0;
        for (int i = 0; i < length; i++) {
            if (!stringArray[i].isBlank()) {
                lengthNewArray++;
            }
        }
        String[] newStringArray = new String[lengthNewArray];
        count = 0;
        for (int i = 0; i < length; i++) {
            if (!stringArray[i].isBlank()) {
                System.arraycopy(stringArray, i, newStringArray, count, );
                count++;
            }

        }
        Arrays.toString(newStringArray);
    }

    private static void printNumbersArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    private static void printDoubleArray(double[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", array[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private static boolean equalsElement(int randomNumber, int[] numbers) {
        for (int number : numbers) {
            if (randomNumber == number) {
                return true;
            }
        }
        return false;
    }

}
