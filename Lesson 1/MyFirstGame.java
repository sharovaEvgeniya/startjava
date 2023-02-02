public class MyFirstGame {

    public static void main(String[] args) {
        int myNum = 101;
        int computerNum = 34;

        if(myNum > 0 && myNum <= 100) {
            while(true) {
                if(myNum == computerNum) {
                    System.out.println("Вы победили! Число загаданное компьютером = " + computerNum);
                    break;
                }

                if(myNum > computerNum) {
                    System.out.println("число" + myNum +" больше того, что загадал компьютер");
                    myNum--;
                } else {
                    System.out.println("число " + myNum +" меньше того, что загадал компьютер");
                    myNum++;
                }
            }
        } else {
            System.out.println("число загаданное вами не попадает в диапазон (0; 100]");
        }
    }
}