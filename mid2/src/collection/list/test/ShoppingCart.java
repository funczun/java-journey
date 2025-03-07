package collection.list.test;

import java.util.ArrayList;

public class ShoppingCart {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        int totalPrice = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("상품명: " + items.get(i).getName() + ", 합계: " + items.get(i).getTotalPrice());
            totalPrice += items.get(i).getTotalPrice();
        }
        System.out.print("전체 가격 합: " + totalPrice);
    }
}
