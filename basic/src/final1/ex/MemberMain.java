package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("funczun", "승준");
        member.print();

        member.changeData("성준");
        member.print();
    }
}
