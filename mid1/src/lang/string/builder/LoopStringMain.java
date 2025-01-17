package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "Java";
        }

        long endTime = System.currentTimeMillis();

        System.out.println(result);
        System.out.printf("time = %dms", (endTime - startTime));
    }
}
