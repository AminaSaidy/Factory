package uzb.aminasaidakhmedova.factory.entity;

import java.awt.*;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Dog implements Comparable<Dog>{
    private static Long nextId = 100L;
    private int age;
    private int weight;
    private Color color;
    private final Long id;

    public Dog(int age, int weight, Color color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = nextId++;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(Dog otherDog) {
        return this.age - otherDog.getAge();
    }

    public enum Color {
        Black(40), White(30), Ginger(20), Gray(10);
        private int popularity;

        Color(int popularity) {
            this.popularity = popularity;
        }

        public int getPopularity() {
            return popularity;
        }
    }

    @Override
    public String toString() {
        return "Dog (Age: " + age + ", weight: " + weight + ", color: " + color + ", id: " + id + ")";
    }
}
