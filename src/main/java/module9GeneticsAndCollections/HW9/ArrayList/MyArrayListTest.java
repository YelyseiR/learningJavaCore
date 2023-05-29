package main.java.module9GeneticsAndCollections.HW9.ArrayList;

public class MyArrayListTest {
        public static void main(String[] args) {
            MyArrayList list = new MyArrayList(1);
            list.add("Hello, ");
            list.add("World ");
            list.add("I ");
            list.add("love ");
            list.add("Java");

            System.out.print("Array list is: ");
            for (int i = 0; i < list.size(); i++) {

                System.out.print(list.get(i));
            }

            list.remove(1);
            System.out.print("\nArray list after removing element at index 1: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }

            System.out.print("\nThe selected value in array is: " + list.get(2));


            list.clear();
            System.out.print("\nArray list after clearing the list: empty. The value is: " + list.size());
            System.out.println("\nSize after clearing the list : " + list.size());
        }
}
