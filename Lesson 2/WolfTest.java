public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.nickname = "Дружок";
        wolf.color = "черный";
        wolf.weight = 45;
        wolf.age = 3;

        System.out.println("кличка волка " + wolf.nickname + "\nокрас "
                + wolf.color + "\nвес " + wolf.weight + "\nвозраст " 
                + wolf.age +"\n");

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}