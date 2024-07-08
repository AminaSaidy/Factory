package uzb.aminasaidakhmedova.factory.entity;

public class Dog {
    private int age;
    private int weight;
    private String color;
    private Long id;

    public Dog(int age, int weight, String color, Long id) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = id;
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

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dog (Age: " + age + ", weight: " + weight + ", color: " + color + ", id: " + id + ")";
    }
}
