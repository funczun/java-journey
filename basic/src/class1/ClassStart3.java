package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "김민수";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "김철수";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = new Student[] {student1, student2};

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // 향상된 for문
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
