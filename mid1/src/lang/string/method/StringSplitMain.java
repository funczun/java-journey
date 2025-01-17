package lang.string.method;

public class StringSplitMain {

    public static void main(String[] args) {
        String str = "Apple, Banana, Cherry";

        // split()
        String[] splits = str.split(", ");
        for (String s : splits) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-", splits);
        System.out.println("joinedStr = " + joinedStr);
    }
}
