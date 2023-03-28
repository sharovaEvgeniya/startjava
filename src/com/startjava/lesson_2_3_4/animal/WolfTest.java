package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Bobik");
        wolf.setColor("black");
        wolf.setWeight(45);
        wolf.setAge(9);

        System.out.println("age " + wolf.getAge());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}