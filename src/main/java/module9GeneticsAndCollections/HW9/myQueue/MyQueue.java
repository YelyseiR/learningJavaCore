package main.java.module9GeneticsAndCollections.HW9.myQueue;

public class MyQueue {


    private Node first;
    private Node last;
    private int size;
    private class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
        }
    }

    public void add(Object value) {  // додає елемент в кінець
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void clear() { //очищає колекцію
        first = null;
        last = null;
        size = 0;
    }

    public int size() {  //повертає розмір колекції
        return size;
    }

    public Object peek() {  //повертає перший елемент з черги
        if (isEmpty()) {
            return null;
        }
        return first.value;
    }

    public Object poll() {  //повертає перший елемент з черги і видаляє його з колекції
        if (isEmpty()) {
            return null;
        }
        Object value = first.value;
        first = first.next;
        size--;
        return value;
    }

    private boolean isEmpty() {
        return (size == 0);
    }
}
