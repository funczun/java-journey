package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        System.out.println("equals: " + str1.equals(str2));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2)); // 대소문자 무시

        System.out.println("'a' compareTo 'b': " + "a".compareTo("b"));
        System.out.println("\"hello\" compareTo \"Hello\": " + str1.compareTo(str2)); // 32
        System.out.println("\"hello\" compareTo \"Hello\": " + str1.compareToIgnoreCase(str2)); // 0

        System.out.println("\"hello\" starts with \"He\": " + str1.startsWith("He"));
        System.out.println("\"hello\" ends with \"o\": " + str1.endsWith("o"));
    }
}
