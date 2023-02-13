public class Jaeger {
    String modelName;
    String marc;
    String origin;
    float height;
    float weight;
    int strength;
    int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String marc, String origin,
                  float height, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.marc = marc;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    void drift() {
        System.out.println("true");;
    }

    void move() {
        System.out.println("moving");
    }

    void scan() {
        System.out.println("scanning");;
    }

    @Override
    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", marc='" + marc + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", strength=" + strength +
                ", armor=" + armor +
                '}';
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

}
