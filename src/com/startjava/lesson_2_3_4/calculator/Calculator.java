public class Calculator {
    int num1;
    int num2;
    char sign;
    public double calculate(String str) {
        mathematicalExpressionArray(str);
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return Math.floorDiv(num1, num2);
            case '%':
                return Math.floorMod(num1, num2);
            case '^':
                return Math.pow(num1, num2);
        }
        return 0;
    }

    private void mathematicalExpressionArray(String str) {
        String[] mathematicalExpressionArray = str.split(" ");
        num1 = Integer.parseInt(mathematicalExpressionArray[0]);
        num2 = Integer.parseInt(mathematicalExpressionArray[2]);
        sign = mathematicalExpressionArray[1].charAt(0);
    }
}
