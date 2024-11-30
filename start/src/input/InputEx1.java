package input;

import java.util.Scanner;

public class InputEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사용자 이름 입력: ");
        String name = sc.nextLine();

        System.out.print("사용자 나이 입력: ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
    }
}
