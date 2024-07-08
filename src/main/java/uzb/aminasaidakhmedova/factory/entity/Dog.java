package uzb.aminasaidakhmedova.factory.entity;

public class Dog {
    private static Long newId = 1000L;
    private int age;
    private int weight;
    private String color;
    private Long id;

    public Dog(int age, int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = newId++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
