package loop;

public class LoopEx2 {
    public static void main(String[] args) {
        // while
        int num = 2;

        while (num <= 20) {
            System.out.println(num);
            num += 2;
        }

        // for
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
