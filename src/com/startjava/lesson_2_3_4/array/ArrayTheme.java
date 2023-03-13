import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbersArr = {4, 1, 5, 2, 7, 3, 6};
        int length = numbersArr.length;
        System.out.print("Массив до модификации :");
        printNumbersArr(numbersArr);
        for (int i = 0; i < length; i++) {
            int temp = numbersArr[i];
            numbersArr[i] = numbersArr[--length];
            numbersArr[length] = temp;
        }
        System.out.print("\nМассив после модификации :");
        printNumbersArr(numbersArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        numbersArr = new int[10];
        length = numbersArr.length;
        for (int i = 0; i < length; i++) {
            numbersArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= numbersArr[i];
            System.out.print(numbersArr[i] + (i != length - 2 ? " * " : " = " + result));
        }
        System.out.println("\n" + numbersArr[0] + " и " + numbersArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив :");
        printDoubleArr(doubleArr);
        int count = 0;
        double middleCellValue = doubleArr[length / 2];
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                count++;
            }
        }
        System.out.println("\nИзмененный массив :");
        printDoubleArr(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        char capitalLetter = 'A';
        for (int i = 0; i < length; i++) {
            alphabet[i] = capitalLetter++;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        numbersArr = new int[30];
        length = numbersArr.length;
        int randomNum;
        for (int i = 0; i < length; i++) {
            do {
                randomNum = (int) (Math.random() * 40 + 60);
            } while (isUnique(randomNum, numbersArr));
            numbersArr[i] = randomNum;

        }
        Arrays.sort(numbersArr);
        for (int i = 0; i < length; i++) {
            System.out.printf(numbersArr[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNonBlankString = 0;
        for (String str : srcString) {
            if (!str.isBlank()) {
                countNonBlankString++;
            }
        }
        String[] destString = new String[countNonBlankString];
        int destPos = 0;
        length = 0;
        for (int i = 0; i < srcString.length; i++) {
            int srcPos = i;
            while (!srcString[i].isBlank()) {
                length++;
                i++;
            }
            if (length != 0) {
                System.arraycopy(srcString, srcPos, destString, destPos, length);
                destPos += length;
                length = 0;
            }
        }
        printStringArr(srcString);
        printStringArr(destString);
    }

    private static void printNumbersArr(int[] arr) {
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }

    private static void printDoubleArr(double[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", arr[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private static boolean isUnique(int randomNumber, int[] arr) {
        for (int number : arr) {
            if (randomNumber == number) {
                return true;
            }
        }
        return false;
    }

    private static void printStringArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == arr.length - 1) {
                System.out.println();
            }
        }
    }
}
