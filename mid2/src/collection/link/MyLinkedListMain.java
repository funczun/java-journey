package collection.link;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("A");
        System.out.println(list);

        list.add("C");
        System.out.println(list);

        list.add(1, "B");
        System.out.println(list);

        list.remove(list.indexOf("A"));
        System.out.println(list);

        list.set(0, "F");
        System.out.println(list);
    }
}
