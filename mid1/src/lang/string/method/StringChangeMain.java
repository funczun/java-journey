package lang.string.method;

public class StringChangeMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터 부분 문자열: " + str.substring(7, 12)); // 이상 미만 규칙

        System.out.println("\"Java\"를 \"World\"로 대체: " + str.replace("Java", "World"));
        System.out.println("첫 \"Java\"를 \"World\"로 대체: " + str.replaceFirst("Java", "World"));

        // 정규 표현식 활용
        System.out.println("정규 표현식 X: " + str.replace("java", "World"));
        System.out.println("정규 표현식 O: " + str.replaceAll("(?i)java", "World"));
    }
}
