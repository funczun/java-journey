package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductOrder[] orders = new ProductOrder[3];

        for (int i = 0; i < orders.length; i++) {
            orders[i] = new ProductOrder();

            System.out.print("Enter product name: ");
            orders[i].productName = sc.nextLine();

            System.out.print("Enter product price: ");
            orders[i].price = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter product quantity: ");
            orders[i].quantity = sc.nextInt();
            sc.nextLine();
        }

        int totalPrice = 0;

        for (ProductOrder o : orders) {
            totalPrice += o.price * o.quantity;
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
        }

        System.out.println("총 금액: " + totalPrice);
    }
}
