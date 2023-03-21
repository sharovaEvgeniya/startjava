public class Calculator {
    private static int num1;
    private static int num2;
    private static char sign;

    public static double calculate(String expression) {
        parseExpression(expression);
        try {
            if (num1 <= 0 || num2 <= 0) {
                throw new RuntimeException();
            }
            return switch (sign) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> Math.floorDiv(num1, num2);
                case '%' -> Math.floorMod(num1, num2);
                case '^' -> Math.pow(num1, num2);
                default -> {
                    System.out.println("Операция " + sign + " не поддерживается");
                    yield 0;
                }
            };
        } catch (RuntimeException exception) {
            System.out.println("Введите положительные числа");
        }
        return 0;
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            num1 = Integer.parseInt(partsExpression[0]);
            num2 = Integer.parseInt(partsExpression[2]);
            sign = partsExpression[1].charAt(0);
        } catch (RuntimeException e) {
            System.out.println("Введите целые числа");
        }
    }
}
