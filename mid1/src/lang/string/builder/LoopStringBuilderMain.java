package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("Java");
        }
        String result = sb.toString();

        long endTime = System.currentTimeMillis();

        System.out.println(result);
        System.out.printf("time = %dms", (endTime - startTime));
    }
}
