public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль\n");
        byte amountOfRAM = 4;
        short busSpeed = 1066;
        int rotationSpeeds = 5400;
        long cache = 3072;
        float processorFrequency = 2.67f;
        double numberOfColors = 16.7;
        char centralProcessor = 'i';
        boolean mssOund = true;
        System.out.println(amountOfRAM + " ГБ объем оперативной памяти \n" + busSpeed
                + " МГц частота шины\n" + rotationSpeeds + 
                " об/ мин скорость вращения жесткого диска\n" + cache + " КБ кэш\n"+ 
                processorFrequency + " ГГц частота процессора\n"+numberOfColors + 
                " миллионов цветов\n"+centralProcessor + "5 Intel Core\n"+ mssOund +
                " Совместимость с MS-Sound\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sum = pricePen + priceBook;
        int discountSum = sum - sum / 100 * discount;
        System.out.println("Сумма скидки " + (sum - discountSum) + 
                "\nОбщая стоимость товаров со скидкой " + discountSum);

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a       \n" + "   J   a a  v   v  a a      \n" + 
                "J  J  aaaaa  V V  aaaaa      \n" + " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение " + maxByte + "\nЗначение после инкремента " 
                + ++maxByte + "\nЗначение после декремента " + --maxByte);
        System.out.println("\nПервоначальное значение " + maxShort + 
                "\nЗначение после инкремента " + ++maxShort 
                +"\nЗначение после декремента " + --maxShort);
        System.out.println("\nПервоначальное значение " + maxInt + 
                "\nЗначение после инкремента " + ++maxInt 
                +"\nЗначение после декремента " + --maxInt);
        System.out.println("\nПервоначальное значение " + maxLong + 
                "\nЗначение после инкремента " + ++maxLong 
                +"\nЗначение после декремента " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int temp;
        System.out.println("с помощью третьей переменной\n ");
        System.out.println("firstNumber = " + num1 + " secondNumber = " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nfirstNumber = " + num1 + " secondNumber = " + num2);
        System.out.println("\nс помощью арифметических операций");
        System.out.println("\nfirstNumber = " + num1 + " secondNumber = " + num2);
        num1 = num1 + num2 - (num2 = num1);
        System.out.println("\nfirstNumber = " + num1 + " secondNumber = " + num2);
        System.out.println("\nс помощью побитовой операции ^");
        System.out.println("\nfirstNumber = " + num1 + " secondNumber = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("\nfirstNumber = " + num1 + " secondNumber = " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char ch1 = '#';
        char ch2 = '&';
        char ch3 = '@';
        char ch4 = '^';
        char ch5 = '_';
        System.out.println((int) ch1 + " - " + ch1 + "\n" + (int) ch2 + " - " + ch2 + "\n" + 
                (int) ch3 + " - " + ch3 + "\n" + (int) ch4 + " - " + 
                ch4 + "\n" + (int) ch5 + " - " + ch5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + backSlash + "        \n" + "   " + slash + "  " 
                + backSlash + "       \n" + "  " + slash + underscore + openParenthesis + " " 
                + closeParenthesis + backSlash + "     \n" + " " + slash + "      " + backSlash 
                + "   \n" + slash + underscore + underscore + underscore + underscore + slash 
                + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        System.out.println("Число "+ number + " содержит: \n" + "    " + hundreds + " сотен\n" 
                + "    " + tens + " десятков\n" + "    " + ones + " единиц\n" 
                + "Сумма его цифр = " + (hundreds + tens + ones) + "\nПроизведение = " 
                + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени\n");
        int time = 86399;
        int hours = time / 3600;
        int minutes = time / 60 % 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}