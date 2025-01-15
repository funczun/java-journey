package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("A-001");
        UserV2 user2 = new UserV2("A-001");

        System.out.println(user1 == user2); // 다른 객체
        System.out.println(user1.equals(user2)); // 같은 String id
    }
}
