package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Cow(), new Dog(), new Duck()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("==== 사운드 호출 ====");
        animal.sound();
        System.out.println("== 사운드 호출 완료 ==");
    }
}
