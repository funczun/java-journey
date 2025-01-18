package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random(1); // 시드 고정

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        int randomRangeInt = random.nextInt(10) + 1; // 1 ~ 10 랜덤
        System.out.println("randomRangeInt = " + randomRangeInt);

        double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);
    }
}
