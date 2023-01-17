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
         int pen = 100;
         int book = 200;
         int discount = 11;
         int sum = pen + book;
         int newSum = sum - sum / 100 * discount;
        System.out.println("Сумма скидки " + discount + "%\n" + 
                "Общая стоимость товаров со скидкой " + newSum);

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a       \n" + "   J   a a  v   v  a a      \n" + 
            "J  J  aaaaa  V V  aaaaa      \n" + " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
         byte maxByte = 127;
         short maxShort = 32767;
         int maxInt = 2147483647;
         long maxLong = 9223372036854775807L;
        System.out.println("Первоначальное значение " + maxByte + "\nЗначение после инкремента " 
                + maxByte++ + "\nЗначение после декремента " + maxByte--);
        System.out.println("\nПервоначальное значение " + maxShort + 
                "\nЗначение после инкремента " + maxShort++ 
                +"\nЗначение после декремента " + maxShort--);
        System.out.println("\nПервоначальное значение " + maxInt + 
                "\nЗначение после инкремента " + maxInt++ 
                +"\nЗначение после декремента " + maxInt--);
        System.out.println("\nПервоначальное значение " + maxLong + 
                "\nЗначение после инкремента " + maxLong++ 
                +"\nЗначение после декремента " + maxLong--);

        System.out.println("\n5. Перестановка значений переменных\n");
         int num1 = 2;
         int num2 = 5;
         int count;
        System.out.println("с помощью третьей переменной\n ");
        System.out.println("firstNumber = " + num1 + " secondNumber = " + num2);
        count = num1;
        num1 = num2;
        num2 = count;
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
        System.out.println("35 - " + ch1 + "\n38 - " + ch2 + "\n64 - " 
            +ch3 + "\n94 - " + ch4 + "\n95 - " + ch5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
         char ch6 = '/';
         char ch7 = '\\';
         char ch8 = '_';
         char ch9 = '(';
         char ch10 = ')';
        System.out.println("    " + ch6 + ch7 + "        \n"+"   " + ch6 +"  " + ch7 
                + "       \n"+"  " + ch6 + ch8 + ch9 + " " + ch10 + ch7 + "     \n"+" " 
                + ch6 + "      " + ch7 + "   \n" + ch6 +ch8 + ch8+ch8+ch8 +ch6 +ch7+ch8+ ch8+ch7);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
         int number = 123;
         int hundreds = number / 100;
         int dozens = number % 100 / 10;
         int units = number % 100 % 10;
        System.out.println("Число "+ number + " содержит: \n" + "    " + hundreds + " сотен\n"
                + "    " + dozens + " десятков\n" + "    " + units + " единиц\n"
                + "Сумма его цифр = " + (hundreds + dozens + units) + "\nПроизведение = " 
                + (hundreds * dozens * units));

        System.out.println("\n9. Вывод времени\n");
         int s = 86399;
         int hours = s / 3600;
         int minutes = s / 60 % 60;
         int seconds = s % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}