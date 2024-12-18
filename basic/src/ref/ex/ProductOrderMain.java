/*
주문 정보를 입력받아 최종 결제 금액을 출력하는 프로그램
 */

package ref.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[System] How many types of products are you going to order?");
        System.out.print("> ");

        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        System.out.println("[System] let me check your orders.");

        for (int i = 0; i < orders.length; i++) {
            System.out.print("> product name: ");
            String name = sc.nextLine();

            System.out.print("> product price: ");
            int price = sc.nextInt();

            System.out.print("> product quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = creatOrder(name, price, quantity); // 주문
        }
        printOrders(orders); // 영수증
        System.out.println("Total Price: " + getTotalPrice(orders)); // 총 결제 금액
    }

    static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        System.out.println("----------------------------------------");
        for (ProductOrder order : orders) {
            System.out.println(order.productName + ", " + order.price + " KRW each, " + order.quantity + " pieces");
        }
        System.out.println("----------------------------------------");
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
