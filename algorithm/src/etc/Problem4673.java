package etc;// https://www.acmicpc.net/problem/4673

public class Problem4673 {

    public static void main(String[] args) {
        int[] numbers = new int[10001];
        selfNumber(numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println(i);
            }
        }
    }

    static void selfNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int index = i;

            String num = Integer.toString(i);
            for (int j = 0; j < num.length(); j++) {
                index += Integer.parseInt(String.valueOf(num.charAt(j)));
            }

            if (index >= numbers.length) {
                continue;
            }

            numbers[index] = 1;
        }
    }
}
