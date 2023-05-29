package main.java.javaCoreHW7;

import java.util.Arrays;

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phraseWords = phrase.split(" "); //Створюється масив `phraseWords`,
                                                    // що містить окремі слова рядка `phrase`, розділені пробілами.
        StringBuilder result = new StringBuilder(); //Створюється об'єкт `StringBuilder`,
                                                // який буде містити остаточний результат після видалення слів.
        for (String word : phraseWords) { // Ітеруємося по кожному слову `word` в масиві `phraseWords`.
            if (!Arrays.asList(words).contains(word)) {  //Якщо слово не збігається з будь-яким елементом масиву `words`,
                                                // додаємо його до результуючого рядка з пробілом в кінці.
                result.append(word).append(" ");
            }
        }
        return result.toString().trim(); /*Повертається результат як рядок, відформатований методом `toString()`
        класу `StringBuilder`, з вилученням можливих пробілів в кінці.
         */
    }
}
class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}