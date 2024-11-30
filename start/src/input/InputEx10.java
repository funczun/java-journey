package input;

import java.util.Scanner;

public class InputEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();

            if (option == 1) {
                sc.nextLine(); // 개행문자 제거

                System.out.print("상품 이름: ");
                String productName = sc.nextLine();

                System.out.print("상품 가격: ");
                int productPrice = sc.nextInt();

                System.out.print("구매 수량: ");
                int productQuantity = sc.nextInt();

                System.out.println("이름: " + productName + ", 가격: " + productPrice + ", 수량: " + productQuantity + ", 합계: " + productPrice * productQuantity);
                totalCost += productPrice * productQuantity;
            } else if (option == 2) {
                System.out.println("최종 결제 금액: " + totalCost);
                totalCost = 0;
            } else {
                break;
            }
        }
    }
}
