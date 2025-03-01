package generic.ex3;

import generic.animal.Animal;

public class Hospital<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void older(T animal) {
        System.out.println(Math.max(this.animal.getAge(), animal.getAge()));
    }

    public T getOlderAnimal(T t1, T t2) {
        if (t1.getAge() > t2.getAge()) {
            return t1;
        } else if (t1.getAge() < t2.getAge()) {
            return t2;
        }
        return null;
    }
}
