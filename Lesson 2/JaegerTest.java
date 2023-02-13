public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Bracer Phoenix", "Mark-5", "USA",
                70.7f, 2.1f, 8, 9);

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMarc("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(250.3f);
        jaeger2.setWeight(18.50f);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);

        jaeger1.move();
        jaeger2.move();

        jaeger1.drift();
        jaeger2.drift();

        jaeger1.scan();
        jaeger2.scan();

        jaeger1.useVortexCannon();
        jaeger2.useVortexCannon();

        System.out.println(jaeger1);
        System.out.println(jaeger2);
    }
}