package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        initMember(m1, "User1", 18, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "User2", 21, 60);

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) {
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }

    static void initMember(MemberInit m, String n, int a, int g) {
        m.name = n;
        m.age = a;
        m.grade = g;
    }
}
