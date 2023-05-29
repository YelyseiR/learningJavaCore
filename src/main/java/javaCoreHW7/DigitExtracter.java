package main.java.javaCoreHW7;

import java.util.ArrayList;
import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text) {
        ArrayList<Integer> digits = new ArrayList<>(); // Створюємо порожній список для зберігання цифр
        for (int i = 0; i < text.length(); i++) { // Проходимо по всім символам у рядку text
            char c = text.charAt(i);
            if(Character.isDigit(c)) {  // Якщо символ є цифрою, то додаємо її у список digits
                digits.add(Character.getNumericValue(c));
            }
        }
        int[] result = new int[digits.size()]; // Створюємо масив з розміром, що дорівнює кількості цифр у списку digits
        for (int i = 0; i < digits.size(); i++) {  // Копіюємо цифри зі списку у масив
            result[i] = digits.get(i);
        }
        return result; // Повертаємо масив цифр
    }
}
/*
    Метод extract() перебирає всі символи у рядку text, використовуючи цикл for.
    Якщо символ є цифрою, то він додає його у список digits за допомогою методу add().
    Після проходження всіх символів у рядку, метод створює масив цілих чисел result з розміром,
    що дорівнює кількості цифр у списку digits. Нарешті, метод копіює всі цифри зі списку digits у масив result,
    використовуючи метод get(), і повертає масив result.
 */

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
