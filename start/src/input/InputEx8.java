package input;

import java.util.Scanner;

public class InputEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격 (-1 입력 시 종료): ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("구매 수량: ");
            int quantity = sc.nextInt();

            System.out.println("총 비용: " + price * quantity);
        }
    }
}
