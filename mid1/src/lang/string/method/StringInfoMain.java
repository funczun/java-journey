package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "Hello, World";
        System.out.println(str.length());
        System.out.println("     ".isBlank());
        System.out.println("     ".isEmpty());

        System.out.println(str.charAt(0));
    }
}
