package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = sb.append("Hello World").append("!")
                .insert(6, "Java ")
                .delete(5, sb.length())
                .reverse()
                .toString();

        System.out.printf("불변 전환: %s", str);
    }
}
