package loop;

public class Loop {
    public static void main(String[] args) {
        // while
        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }

        // continue
        int j = 1;

        while (j <= 10) {
            if (j == 7) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }

        // for
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }
    }
}
