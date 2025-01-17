package lang.string.method;

public class StringUtilMain {

    public static void main(String[] args) {
        int num = 10;
        boolean bool = true;
        Object obj = new Object();
        String str = "true";

        System.out.println(str.equals(bool)); // false
        System.out.println(str.equals(String.valueOf(bool))); // true


        // valueOf
        System.out.println(String.valueOf(num)); // "10"
        System.out.println(String.valueOf(obj)); // obj.toString()

        // toCharArray
        char[] charArray = str.toCharArray();
        System.out.println("charArray = " + charArray);
        System.out.println(charArray);

        // format
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("PI: %.2f", 3.141592);
        System.out.println(format2);

        // printf
        System.out.printf("%.2f\n", 3.141592); // printf 개행 문자 포함하지 않음
        System.out.println("test");
    }
}
