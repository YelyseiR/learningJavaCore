package main.java.javaCoreHW7;

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int counter = 0;
        String[] words = phrase.split(" ");
        for (String word : words) {
            if(word.length() <= minLength) {
                counter++;
            }
        }
        return counter;
    }
}
        /* Метод split() використовується для розбиття рядка на масив рядків words, що містить всі слова рядка phrase
        розділені одним пробілом.
        Рядок for (String word : words) є підставою для ітерації по всім елементам масиву words. За допомогою цього рядка
        ми перебираємо всі слова в рядку phrase та збільшуємо лічильник count, якщо довжина поточного слова не перевищує
        заданого порогу minLength.
        */

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}