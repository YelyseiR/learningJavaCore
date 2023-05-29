package main.java.module9GeneticsAndCollections.HW9.myLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }

        list.remove(2);

        //Виводимо список знову
        System.out.println("\nElements after remove are: ");
        for (int i = 0; i < list.size(); i++) {

            System.out.println("Element " + i + ": " + list.get(i));
        }

        //Очищаємо список
        list.clear();

        //Перевіряємо, що список порожній після очищення
        System.out.println("\nList after clearing " + list.size());
    }
}
