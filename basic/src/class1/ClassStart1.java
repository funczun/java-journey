package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String[] studentNames = new String[5];
        int[] studentAges = new int[5];
        int[] studentGrades = new int[5];

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
