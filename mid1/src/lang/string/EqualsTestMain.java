package lang.string;

public class EqualsTestMain {

    public static void main(String[] args) {
        char[] chars = new char[] {'j', 'a', 'v', 'a'};
        System.out.println(chars);

        String str1 = new String(chars);
        String str2 = new String("java");
        String str3 = "java";
        String str4 = "java";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str3);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
    }
}
