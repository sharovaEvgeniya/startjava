import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println(Arrays.toString(numbers));
        int sumArr = 0;
        for (int i = 1; i < length - 1; i++) {
            sumArr *= numbers[i];
            System.out.print(numbers[i] + (i != length - 2 ? " * " : " = " + sumArr));
        }
    }
}
