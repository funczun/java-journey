package enumeration.test.ex1;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static void accessMenu(AuthGrade grade) {
        if (grade.getLevel() >= 1) {
            System.out.println("== 메뉴 목록 ==\n- 메인 화면");
        }
        if (grade.getLevel() >= 2) {
            System.out.println("- 이메일 관리 화면");
        }
        if (grade.getLevel() >= 3) {
            System.out.println("- 관리자 화면");
        }
    }
}
