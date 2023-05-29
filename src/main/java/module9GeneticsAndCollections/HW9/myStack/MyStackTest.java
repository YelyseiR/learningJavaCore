package main.java.module9GeneticsAndCollections.HW9.myStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1); //додаємо елементи
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println(myStack.peek()); //5

        myStack.remove(2);

        System.out.println(myStack.pop()); //5
        System.out.println(myStack.pop()); //4

        myStack.clear();

        System.out.println(myStack.size()); //0
    }
}
