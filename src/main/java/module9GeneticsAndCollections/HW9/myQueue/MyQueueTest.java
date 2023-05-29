package main.java.module9GeneticsAndCollections.HW9.myQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("Element 1");  //додаємо елементи
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("Initial queue:");
        System.out.println("size: " + queue.size()); // розмір колекції
        System.out.println("peek: " + queue.peek());  // перший елемент з черги

        System.out.println("\nRemoving first element from queue:");
        System.out.println("poll: " + queue.poll());  //повертаємо перший елемент з черги і видаляємо його з колекції
        System.out.println("size: " + queue.size());
        System.out.println("peek: " + queue.peek());

        System.out.println("\nClearing queue:");
        queue.clear();  // очищаємо колекцію
        System.out.println("size: " + queue.size());
    }
}
