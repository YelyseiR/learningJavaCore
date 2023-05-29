package main.java.javaCoreHW7;

import java.util.Arrays;

class WordSplitter {
    public String[] split(String phrase) {
        return phrase.toLowerCase().split("\\s+");
        /*
        Строка "\\s+" використовується як аргумент методу `split()`. Ця строка є регулярним виразом, який означає будь-який
        пробільний символ (пробіл, табуляція, переведення рядка тощо) і один або більше його повторень.
        Отже, метод `split("\\s+")` розділить рядок на слова, використовуючи будь-який пробільний символ
        як роздільник, і поверне масив рядків, що містить окремі слова. Наприклад, рядок `"Hello world"`
        буде розділений на два слова: Hello та world.
         */
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}