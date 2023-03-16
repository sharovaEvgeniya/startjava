public class Calculator {
    private static int num1;
    private static int num2;
    private static char sign;
    private static double result;

    public static double calculate(String expression) {
        parsExpressionArray(expression);
        if (num1 < 0 || num2 < 0) {
            System.out.println("Введите положительные числа");
            return result = 0;
        }
        return result = switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            case '^' -> Math.pow(num1, num2);
            default -> 0;
        };
    }

    public static void outputsResult() {
        if (result % 1 == 0) {
            System.out.println("Результат : " + (int) result);
        } else {
            System.out.printf("Результат : %.3f", result);
        }
    }

    private static void parsExpressionArray(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            num1 = Integer.parseInt(partsExpression[0]);
            num2 = Integer.parseInt(partsExpression[2]);
            sign = partsExpression[1].charAt(0);
        } catch (RuntimeException e) {
            System.out.println("Введите корректные значения");
        }
    }
}
