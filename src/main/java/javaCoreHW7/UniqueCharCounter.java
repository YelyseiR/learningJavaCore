package main.java.javaCoreHW7;

class UniqueCharCounter {

    public int count(String phrase) {
        char[] letter = phrase.toCharArray();
        int count = phrase.length();
        for (int i = 0; i < letter.length; i++) {
            if (i != phrase.indexOf(letter[i])) {
                /* Якщо індекс поточного символу не дорівнює індексу першого входження цього символу у рядок,
                тоді це не унікальний символ. Зменшуємо лічильник кількості символів.
                */
                count--;
            }
        }
        return count;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
