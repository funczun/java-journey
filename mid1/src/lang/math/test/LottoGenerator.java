package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private Random random = new Random();
    private int[] numbers = new int[7];
    private int count;

    public void generate() {
        while (count < 7) {
            int goldNumber = random.nextInt(45) + 1;
            if (isUnique(goldNumber)) {
                numbers[count] = goldNumber;
                count++;
            }
        }
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (number == numbers[i]) {
                return false;
            }
        }
        return true;
    }

    public void showResult() {
        System.out.print("추첨 결과: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n보너스 볼: " + numbers[6]);
    }
}
