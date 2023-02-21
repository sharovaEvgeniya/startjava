public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Bobik");
        wolf.setColor("black");
        wolf.setWeight(45);
        wolf.setAge(9);

        // System.out.println("кличка волка " + wolf.getNickname() + "\nокрас "
        //         + wolf.getColor() + "\nвес " + wolf.getWeight() + "\nвозраст " 
        //         + wolf.getAge() +"\n");
        System.out.println("age " + wolf.getAge());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}