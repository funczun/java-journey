package lang.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "my java world";
        String word = "java";

        System.out.println(str.contains("java"));
        System.out.println(str.contains(word));

        System.out.println(str.indexOf("java"));
        System.out.println(str.lastIndexOf("java"));
    }
}
