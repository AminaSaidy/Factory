package uzb.aminasaidakhmedova.factory._main;

import uzb.aminasaidakhmedova.factory.entity.Dog;
import uzb.aminasaidakhmedova.factory.entity.DogFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Main {
    public static void main(String args[]) {
        DogFactory dogFactory = DogFactory.getInstance();
        List<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            dogs.add(dogFactory.createDog());
        }

        System.out.println("Unsorted list of dogs: ");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Collections.sort(dogs);

        System.out.println("Sorted by age: ");
        for(Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
