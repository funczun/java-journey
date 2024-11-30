package input;

import java.util.Scanner;

public class InputEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름 입력: ");
        String foodName = sc.nextLine();

        System.out.print("음식 가격 입력: ");
        int foodPrice = sc.nextInt();

        System.out.print("음식 수량 입력: ");
        int foodQuantity = sc.nextInt();

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨으며, 총 금액은 " + foodPrice * foodQuantity + "원입니다.");
    }
}
