package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        sb.append("!");
        System.out.println(sb);

        sb.insert(6, "Java ");
        System.out.println(sb);

        sb.delete(5, sb.length());
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.printf("불변 전환: %s", str);
    }
}
