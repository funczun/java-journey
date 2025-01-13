package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하새요: ");
            String payOption = sc.nextLine();

            if (payOption.equals("exit")) {
                return;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            payService.processPay(payOption, amount);
        }
    }
}
