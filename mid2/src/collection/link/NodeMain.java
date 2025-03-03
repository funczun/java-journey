package collection.link;

public class NodeMain {
    public static void main(String[] args) {
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");

        System.out.println("모든 노드 탐색\n" + head);
    }
}
