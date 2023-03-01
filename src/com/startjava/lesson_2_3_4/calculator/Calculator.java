public class Calculator {
    public void calculate(int num1, char sign, int num2) {
        int result = 1;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
