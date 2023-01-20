public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 27;
        boolean maleGender = false;
        int height = 168;

        if(age > 20) {
            System.out.println("ого, вам уже есть 20!");
        } else {
            System.out.println("извините, вы еще слишком молоды");
        }

        if(!maleGender) {
            System.out.println("вы женщина");
        } else {
            System.out.println("вы мужчина");
        }

        if(height < 180) {
            System.out.println("приходите когда будете выше");
        } else {
            System.out.println("проходите");
        }

        char firstLetterName = "Evgenia".charAt(0);

        if(firstLetterName == 'M') {
            System.out.println("ваше имя начинается на M");
        } else if(firstLetterName == 'I') {
            System.out.println("ваше имя начинается на I");
        } else {
            System.out.println("ваше имя начинается не на M и I");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 271;
        int num2 = 96;

        if(num1 > num2) {
            System.out.println(num1 + " - max\n" + num2 + " - min");
        } else if (num1 == num2) {
            System.out.println("числа " + num1 + " и " + num2 + " равны");
        } else {
            System.out.println(num2 + " - max\n" + num1 + " - min");
        }

        System.out.println("\n3. Проверка числа\n");
        int num3 = 73;

        if(num3 == 0) {
            System.out.println(num3 + " равно 0");
        } else {
            if(num3 % 2 == 0) {
                System.out.println(num3 + " четное");
            } else {
                System.out.println(num3 + " не четное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int num4 = 123;
        int num5 = 125;
        int ones4 = num4 % 10;
        int ones5 = num5 % 10;
        int tens4 = num4 % 100 / 10;
        int tens5 = num5 % 100 / 10;
        int hundreds4 = num4 / 100;
        int hundreds5 = num5 / 100;
        System.out.println("исходные числа " + num4 + " и " + num5);

        if(ones4 == ones5) {
            System.out.println("одинаковые в них цифры " + ones4 + " и "
                + ones5 + ", номера разрядов - единицы");
        }

        if(tens4 == tens5) {
            System.out.println("одинаковые в них цифры " + tens4 + " и "
                + tens5 + ", номера разрядов - десятки");
        }

        if(hundreds4 == hundreds5) {
            System.out.println("одинаковые в них цифры "
                + hundreds4 + " и " + hundreds5 + ", номера разрядов - сотни");
        }

        if(ones4 != ones5 && tens4 != tens5 && hundreds4 != hundreds5) {
            System.out.println("равных цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char symbol = '\u0057';
        if(symbol >= (int)'A' && symbol <= (int)'Z') {
            System.out.println(symbol + " большая буква");
        } else if(symbol >= (int)'a' && symbol <= (int)'z') {
            System.out.println(symbol + " маленькая буква");
        } else if(symbol >= (int)'0' && symbol <= (int)'9') {
            System.out.println(symbol + " число");
        } else{
            System.out.println(symbol + " не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        int depositSum = 300000;
        int interestRate = 0;
        int interestAccrued = 0;
        int finalSum = 0;

        if(depositSum < 100000) {
            interestRate = 5;
            interestAccrued = depositSum / 100 * interestRate;
            finalSum = depositSum + interestAccrued;
        }

        if(depositSum >= 100000 && depositSum < 300000) {
            interestRate = 7;
            interestAccrued = depositSum / 100 * interestRate;
            finalSum = depositSum + interestAccrued;
        }

        if (depositSum >= 300000) {
            interestRate = 10;
            interestAccrued = depositSum / 100 * interestRate;
            finalSum = depositSum + interestAccrued;
        }

        System.out.println(depositSum + " сумма вклада\n" + interestAccrued +
                 " начисленный %\n" + finalSum + " итоговая сумма с %\n");

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int gradeHistory = 0;
        int gradeProgramming = 0;

        if(historyPercent <= 60) {
            gradeHistory = 2;
        } else if(historyPercent > 60 && historyPercent < 73) {
            gradeHistory = 3;
        } else if(historyPercent > 73 && historyPercent < 91) {
            gradeHistory = 4;
        } else {
            gradeHistory = 5;
        }
        
         if(programmingPercent <= 60) {
            gradeProgramming = 2;
        } else if(programmingPercent > 60 && programmingPercent < 73) {
            gradeProgramming = 3;
        } else if(programmingPercent > 73 && programmingPercent < 91) {
            gradeProgramming = 4;
        } else {
            gradeProgramming = 5;
        }
        System.out.println("история - " + gradeHistory + ", программирование - " 
                + gradeProgramming + "\nсредний балл - " 
                + ((gradeHistory + gradeProgramming) / 2) + "\nсредний % по предметам - " 
                + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n8. Расчет прибыли за год\n");
        int rent = 5000;
        int income = 13000;
        int cost = 9000;
        int annualProfit = (income - cost - rent) * 12;
        if(annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit);
        } else {
            System.out.println("прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int neededSum = 567; 
        int nominal1 = 1;
        int nominal10 = 10;
        int nominal100 = 100;
        int numberOfBanknotes1 = 50;
        int numberOfBanknotes10 = 5;
        int numberOfBanknotes100 = 10;
        int need100 = 0;
        int need10 = 0;
        int need1 = 0;
        int onesBanknote = neededSum % 10;
        int tensBanknote = neededSum % 100 / 10;
        int hundredsBanknote = neededSum / 100;

        if(hundredsBanknote <= numberOfBanknotes100 && tensBanknote <= numberOfBanknotes10 && 
                onesBanknote <= numberOfBanknotes1) {

            need100 = hundredsBanknote;
            need10 = tensBanknote;
            need1 = onesBanknote;


            System.out.println("номиналы банкнот\n" + nominal100 + " в количестве - " + need100
                    + " ,\n"+ nominal10 + " в количестве - " + need10 + ",\n" + nominal1 
                    + " в количестве - " + need1 + "\nвыдаваемая сумма " + neededSum);
        }

        if(hundredsBanknote > numberOfBanknotes100) {
            need100 = numberOfBanknotes100;
            tensBanknote = (hundredsBanknote - numberOfBanknotes100) * 10 + tensBanknote;

            if(tensBanknote > numberOfBanknotes10) {
                need10 = numberOfBanknotes10;
                need1 = (tensBanknote - numberOfBanknotes10) * 10 + onesBanknote;

                System.out.println("номиналы банкнот\n" + nominal100 + " в количестве - " + need100
                        + " ,\n"+ nominal10 + " в количестве - " + need10 + ",\n" + nominal1 
                        + " в количестве - " + need1 + "\nвыдаваемая сумма " + neededSum);
            }
        }

        if(hundredsBanknote <= numberOfBanknotes100) {
            need100 = hundredsBanknote;
            if(tensBanknote > numberOfBanknotes10) {
                need10 = numberOfBanknotes10;
                need1 = (tensBanknote - numberOfBanknotes10) * 10 + onesBanknote;
            System.out.println("номиналы банкнот\n" + nominal100 + " в количестве - " + need100
                    + " ,\n"+ nominal10 + " в количестве - " + need10 + ",\n" + nominal1 
                    + " в количестве - " + need1 + "\nвыдаваемая сумма " + neededSum);
            }
        }
        if(hundredsBanknote >= numberOfBanknotes100 && tensBanknote > numberOfBanknotes10 && 
                onesBanknote > numberOfBanknotes1) {
            System.out.println("банкнот не хватает для выдачи" + neededSum +" суммы");
        }
    }
}

