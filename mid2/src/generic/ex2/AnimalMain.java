package generic.ex2;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain {

    public static void main(String[] args) {
        Cat ace = new Cat("Ace", 10);
        Dog brian = new Dog("Brian", 20);

        Box<Cat> catBox = new Box<>();
        Box<Dog> dogBox = new Box<>();

        catBox.set(ace);
        dogBox.set(brian);

        System.out.println(catBox.getValue());
        System.out.println(dogBox.getValue());
    }
}
