package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시작 잔액은 0원입니다.");
        int balance = 0;

        while (true) {
            System.out.println("--------------------------------------\n1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료\n--------------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("입금액 입력: ");
                int amount = sc.nextInt();
                balance = deposit(balance, amount);
            } else if (choice == 2) {
                System.out.print("출금액 입력: ");
                int amount = sc.nextInt();
                balance = withdraw(balance, amount);
            } else if (choice == 3) {
                System.out.println("최종 잔액: " + balance + "원");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("올바른 입력이 아닙니다.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        } else {
            System.out.println(amount + "원을 출금할 수 없습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
