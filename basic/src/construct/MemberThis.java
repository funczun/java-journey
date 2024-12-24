package construct;

public class MemberThis {
    // 멤버 변수
    String nameField;

    // 지역 변수 (매개변수)
    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략
    }
}
