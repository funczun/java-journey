package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(10000);

        acc.withdraw(9000);
        acc.withdraw(2000); // 오류 메시지 출력

        System.out.println("Balance = " + acc.balance);
    }
}
