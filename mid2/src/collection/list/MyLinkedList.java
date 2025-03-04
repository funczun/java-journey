package collection.list;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private int size;

    private Node<E> getLastNode() {
        Node<E> x = head;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private Node<E> getNode(int index) {
        Node<E> x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.data;
    }

    @Override
    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = (E) x.data;
        x.data = e;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.data;
        if (index == 0) {
            head = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.data = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = head; x != null; x = x.next) {
            if (e.equals(x.data))
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.data);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
