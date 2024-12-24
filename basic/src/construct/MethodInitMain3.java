package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("User1", 18, 90);

        MemberInit m2 = new MemberInit();
        m2.initMember("User2", 21, 60);

        MemberInit[] members = {m1, m2};

        for (MemberInit m : members) {
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }
}
