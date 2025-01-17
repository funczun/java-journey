package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String string : arr) {
            System.out.printf("%s: %d\n", string, string.length());
            sum += string.length();
        }
        System.out.printf("sum = %d", sum);
    }
}
