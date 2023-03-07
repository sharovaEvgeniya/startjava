import java.text.DecimalFormat;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbersArr = {4, 1, 5, 2, 7, 3, 6};
        int length = numbersArr.length;
        System.out.print("Массив до модификации :");

        for (int i = 0; i < length; i++) {
            System.out.print(" " + numbersArr[i]);
        }

        for (int i = 0; i < length / 2; i++) {
            int temp = numbersArr[i];
            numbersArr[i] = numbersArr[length - 1 - i];
            numbersArr[length - 1 - i] = temp;
        }

        System.out.print("\nМассив после модификации :");

        for (int i = 0; i < length; i++) {
            System.out.print(" " + numbersArr[i]);
        }
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


    }

    private static void printDoubleArray(double[] doubleArr) {
        int length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", doubleArr[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }
}
