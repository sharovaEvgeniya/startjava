public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        char sign = '^';
        int result = 1;

        if(sign == '+') {
            result = a + b;
        } else if(sign == '-') {
            result = a - b;
        } else if(sign == '*') {
            result = a * b;
        } else if(sign == '/') {
            result = a / b;
        } else if(sign == '%') {
            result = a % b;
        } else if(sign == '^') {
            for(int i = 0; i < b; i++) {
                result *= a;
                System.out.println(result);
            }
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}