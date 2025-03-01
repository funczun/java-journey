package generic.animal;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int size) {
        this.name = name;
        this.age = size;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void sound();

    @Override
    public String toString() {
        return "Animal { " +
                "name = '" + name + '\'' +
                ", age = " + age +
                " }";
    }
}
