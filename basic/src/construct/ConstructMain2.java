package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("User1", 18);
        MemberConstruct m2 = new MemberConstruct("User2", 21, 60);

        MemberConstruct[] members = {m1, m2};

        for (MemberConstruct m : members) {
            System.out.println("Info) " + m.name + ", " + m.age + ", " + m.grade);
        }
    }
}
