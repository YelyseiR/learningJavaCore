package main.java.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLoops {
    public static void main(String[] args) {
//        String[] arr = {"John@gmail.com", "Mike@gmail.com", "Irina@gmail.com"};
        /* Перебирання масиву за індексами "int i = 0" - реалізували змінну та індекс елементу початку масиву.
        "i < arr.length" - обозначили довжину масиву.
        "i++" обробка кожного елемента масиву.
         */
//        for (int i = 0; i < arr.length; i++) {
//            sendMessageToEmail(arr[i]);
//        }

        /*Метод foreach можна використовувати, коли необхідно перебрати всі елементи масиву у випадках коли не потрібно
        перебирати елементи масиву по індексно. foreach - для кожного.
         */
//        for (String arrElement : arr){
//            sendMessageToEmail(arrElement);
//        }

        /* Реалізація за допомогою "stream().forEach
        "
         */
//        List<String> arrEmails = Arrays.asList("John@gmail.com", "Mike@gmail.com", "Irina@gmail.com");
//        arrEmails.stream().forEach(arrElement -> sendMessageToEmail(arrElement));
//    }

        /* Використання while - метод виконається тільки тоді, коли умова while - true, якщо вона false, то метод
        не виконається. У прикладі нижче "Condition 'j<=5' is always 'false'" і метод не виконується.
         */
        int j = 10;
        while (j<=5){
            System.out.println(j);
            j++;
        }

        /* Використання do-while в даному випадку у нас спочатку виконається do, а потім буде переглядатися умова while.
        Тобто, навіть якшо умова while - false, то метод все одно принаймні один раз виконає умову do.
         */
//        int k = 10;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k <= 5);
//
//    public static void sendMessageToEmail(String email) {
//        System.out.println("Send message to email " + email);
    }
}
