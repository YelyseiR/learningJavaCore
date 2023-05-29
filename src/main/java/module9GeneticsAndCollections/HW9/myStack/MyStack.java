package main.java.module9GeneticsAndCollections.HW9.myStack;

import java.util.EmptyStackException;

public class MyStack {
    private Node top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(Object value) { //додає елемент в кінець
        Node node = new Node(value);
        node.next = top;
        top = node;
        size++;
    }

    public void remove(int index) { //видаляє елемент за індексом
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            top = top.next;
            size--;
            return;
        }
        Node current = top;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }


    public void clear() {  //очищає колекцію
        top = null;
        size = 0;
    }


    public int size() {  //повертає розмір колекції
        return size;
    }


    public Object peek() { //повертає перший елемент стеку
        if(top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }


    public Object pop() {  //повертає перший елемент стеку та видаляє його з колекції
        if(top==null) {
            throw new EmptyStackException();
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
