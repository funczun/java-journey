package etc;// https://www.acmicpc.net/problem/10814

import java.util.*;

class Person {
    int age;
    String name;

    // 생성자
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // toString() 메서드
    @Override
    public String toString() {
        return age + " " + name;
    }
}

public class Problem10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 사람 리스트 생성
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            people.add(new Person(age, name));
        }

        // 나이순 정렬
        people.sort(Comparator.comparingInt(person -> person.age));

        // 결과 출력
        for (Person person : people) {
            System.out.println(person);
        }

        sc.close();
    }
}
