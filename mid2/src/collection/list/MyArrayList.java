package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    public MyArrayList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = e;
    }

    @Override
    public void add(int index, E e) {
        if (size == elements.length) {
            grow();
        }
        shiftRightFrom(index);
        elements[index] = e;
        size++;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E set(int index, E e) {
        E old = get(index);
        elements[index] = e;
        return old;
    }

    @Override
    public E remove(int index) {
        E old = get(index);
        shiftLeftFrom(index);
        size--;
        elements[size] = null;
        return old;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size)) +
                " size=" + size + ", capacity=" + elements.length;
    }
}
