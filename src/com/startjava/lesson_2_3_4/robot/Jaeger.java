package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    String modelName;
    String mark;
    String origin;
    float height;
    float weight;
    int strength;
    int armor;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin,
            float height, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
        System.out.println("true");
    }

    void move() {
        System.out.println("moving");
    }

    void scan() {
        System.out.println("scanning");
    }

    void useVortexCannon() {
        System.out.println("activated");
    }

    @Override
    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", marc='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", strength=" + strength +
                ", armor=" + armor +
                '}';
    }
}
