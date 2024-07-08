package uzb.aminasaidakhmedova.factory.entity;

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
}
