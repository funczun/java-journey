package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

import java.util.Scanner;

public class HospitalMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Hospital<Animal> hospital = new Hospital<>();

        Animal pet1 = inputPetInfo();
        Animal pet2 = inputPetInfo();

        Animal olderPet = hospital.getOlderAnimal(pet1, pet2);
        System.out.println(olderPet);
    }

    static <T extends Animal> T inputPetInfo() {
        String petType = "";
        while (!petType.equals("Cat") && !petType.equals("Dog")) {
            System.out.print("동물 타입 입력(Cat/Dog): ");
            petType = sc.nextLine();
        }

        if (petType.equals("Cat")) {
            return (T) new Cat(getPetName(), getPetAge());
        } else {
            return (T) new Dog(getPetName(), getPetAge());
        }
    }

    static String getPetName() {
        System.out.print("동물 이름 입력: ");
        return sc.nextLine();
    }

    static int getPetAge() {
        System.out.print("동물 나이 입력: ");
        int petAge = sc.nextInt();
        sc.nextLine();
        return petAge;
    }
}
