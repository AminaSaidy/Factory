package uzb.aminasaidakhmedova.factory.entity;

import java.util.Random;

public class DogFactory {
    private static DogFactory instance;

    private DogFactory() {
    }

    public static DogFactory getInstance() {
        if (instance == null) {
            instance = new DogFactory();
        }
        return instance;
    }

    public Dog createDog() {
        Random random = new Random();
        int age = random.nextInt(20);
        int weight = random.nextInt(30);
        Dog.Color color = Dog.Color.values()[(int) (Math.random() * Dog.Color.values().length)];
        return new Dog(age, weight, color);
    }
}
