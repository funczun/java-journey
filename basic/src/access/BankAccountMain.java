package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.deposit(-300);
        account.withdraw(300);
        System.out.println("잔액: " + account.getBalance() + "원");
    }
}
