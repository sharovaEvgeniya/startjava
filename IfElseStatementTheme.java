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
            System.out.println("число равно нулю");
        } else {
            if(num3 % 2 == 0) {
                System.out.println(num3 + " четное");
            } else {
                System.out.println(num3 + " не четное");
            }

            if(num3 > 0) {
                System.out.println("и положительное число");
            } else {
                System.out.println("и отрицательное число");
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
        if(symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " большая буква");
        } else if(symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " маленькая буква");
        } else if(symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " число");
        } else{
            System.out.println(symbol + " не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");
        int depositSum = 300000;
        int interestRate = 10;

        if(depositSum < 100000) {
            interestRate = 5;
        } else if(depositSum >= 100000 && depositSum < 300000) {
            interestRate = 7;
        }

        int interestAccrued = depositSum / 100 * interestRate;
        int finalSum = depositSum + interestAccrued;
        System.out.println(depositSum + " сумма вклада\n" + interestAccrued +
                 " начисленный %\n" + finalSum + " итоговая сумма с %\n");

        System.out.println("\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int gradeHistory = 5;
        int gradeProgramming = 5;

        if(historyPercent <= 60) {
            gradeHistory = 2;
        } else if(historyPercent > 60 && historyPercent < 73) {
            gradeHistory = 3;
        } else if(historyPercent > 73 && historyPercent < 91) {
            gradeHistory = 4;
        }
        
        if(programmingPercent <= 60) {
            gradeProgramming = 2;
        } else if(programmingPercent > 60 && programmingPercent < 73) {
            gradeProgramming = 3;
        } else if(programmingPercent > 73 && programmingPercent < 91) {
            gradeProgramming = 4;
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
        int numberOfBanknotes1 = 50;
        int numberOfBanknotes10 = 5;
        int numberOfBanknotes100 = 10;
        int banknotes1 = neededSum % 10;
        int banknotes10 = neededSum % 100 / 10;
        int banknotes100 = neededSum / 100;
        int need1 = banknotes1;
        int need10 = banknotes10;
        int need100 = banknotes100;

        if(banknotes100 <= numberOfBanknotes100) {
            need100 = banknotes100;
            if(banknotes10 > numberOfBanknotes10) {
                need10 = numberOfBanknotes10;
                need1 += (banknotes10 - numberOfBanknotes10) * 10;
                System.out.println("номиналы банкнот\n"  + "100 в количестве - " + need100
                        + " ,\n"  + "10 в количестве - " + need10 + ",\n" 
                        + "1 в количестве - " + need1 + "\nвыдаваемая сумма " + neededSum);
            }
        } else if(banknotes100 >= numberOfBanknotes100 || banknotes10 > numberOfBanknotes10 || 
                banknotes1 > numberOfBanknotes1) {
            System.out.println("банкнот не хватает для выдачи " + neededSum +" суммы");
        }
    }
}

