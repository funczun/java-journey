package array;

public class Array {
    public static void main(String[] args) {
        // 1차원 배열
        int[] students = new int[] {90, 80, 70, 60, 50}; // 배열 변수 선언

        System.out.println(students); // [I: 배열 타입 (int), @-: 구분 기호와 배열 객체 해시코드 (16진수 참조값)
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수는 " + students[i] + "점입니다.");
        }

        // 2차원 배열
        int[][] arr = {
            {2, 3, 2},
            {3, 2, 3}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

        // 1씩 상승하는 2차원 배열
        int[][] arrPlus = new int[3][3];

        int i = 1;
        for (int row = 0; row < arrPlus.length; row++) {
            for (int col = 0; col < arrPlus[row].length; col++) {
                arrPlus[row][col] = i++;
            }
        }

        for (int row = 0; row < arrPlus.length; row++) {
            for (int col = 0; col < arrPlus[row].length; col++) {
                System.out.print(arrPlus[row][col]);
            }
            System.out.println();
        }

        // 향상된 for
        int[] numbers = {10, 20, 30, 40};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
