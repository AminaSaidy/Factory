package uzb.aminasaidakhmedova.factory.entity;

import java.util.Random;

public class Dog {
    private static Long newId = 1000L;
    private int age;
    private int weight;
    private String color;
    private Long id;

    public Dog(String color) {
        this.age = new Random().nextInt(20);
        this.weight = new Random().nextInt(30);
        this.color = color;
        this.id = newId++;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dog (Age: " + age + ", weight: " + weight + ", color: " + color + ", id: " + id + ")";
    }
}
