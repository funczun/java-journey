package array;

import java.util.Scanner;

public class ArrEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 상품 수 입력
        System.out.println("[System] 등록 가능한 최대 상품 수를 입력하세요.");
        int n = sc.nextInt();

        String[] productName = new String[n];
        int[] productPrice = new int[n];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("옵션 선택 (숫자): ");
            int choice = sc.nextInt();

            // 입력에 따른 조건문 실행
            if (choice == 3) {
                break;
            } else if (choice == 1) {
                if (productCount < n) {
                    System.out.print("상품 이름 입력: ");
                    productName[productCount] = sc.next();
                    System.out.print("상품 가격 입력: ");
                    productPrice[productCount] = sc.nextInt();
                    productCount++;
                } else if (productCount == n) {
                    System.out.println("[System] 등록 가능한 상품 수를 초과합니다.");
                }
            } else if (choice == 2) {
                if (productCount == 0) {
                    System.out.println("[System] 등록된 상품이 없습니다.");
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] + ": " + productPrice[i] + "원");
                }
            }
        }
    }
}
