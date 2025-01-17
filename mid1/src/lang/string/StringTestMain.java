package lang.string;

public class StringTestMain {

    public static void main(String[] args) {

        String str = "hello";

        System.out.println("==== test 1 ====");
        str.concat("java");
        System.out.println("str = " + str);

        System.out.println("==== test 2 ====");
        str = str.concat(" java");
        System.out.println("str = " + str);
    }
}
