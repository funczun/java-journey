package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        // while
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //for
        sum = 0; // 초기화

        for (i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
