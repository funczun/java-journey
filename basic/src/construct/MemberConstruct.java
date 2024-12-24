package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // int grade 없는 생성자
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 오버로딩
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("Constructing " + name + " with age " + age + " and grade " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
