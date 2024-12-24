package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.name = "User1";
        m1.age = 18;
        m1.grade = 90;

        MemberInit m2 = new MemberInit();
        m2.name = "User2";
        m2.age = 21;
        m2.grade = 60;

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) {
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }
}
