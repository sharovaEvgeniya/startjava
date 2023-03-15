public class Calculator {
    public double calculate(int num1, char sign, int num2) {
        double result = 0;
        switch (sign) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '*':
                result = Math.multiplyExact(num1, num2);
                break;
            case '/':
                result = Math.floorDiv(num1, num2);
                break;
            case '%':
                result = Math.floorMod(num1, num2);
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
        }
        return result;
    }
}
