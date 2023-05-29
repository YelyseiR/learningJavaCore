package main.java.javaCoreHW7;

class PalindromeDetector {
    public boolean isPalindrome(String word) {
        // Порівнюємо слово з його реверснутою копією, ігноруючи регістр символів
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        /*Створюємо новий об'єкт класу StringBuilder зі словом і реверсимо його
         за допомогою методу reverse(), після чого перетворюємо на рядок за допомогою toString()
         */
        return new StringBuilder(word).reverse().toString();
    }
}

    /*PalindromeDetector, містить два методи isPalindrome та reverse. Метод isPalindrome приймає рядок як аргумент
    і повертає логічне значення true, якщо слово є паліндромом (тобто, якщо його реверсна копія дорівнює оригіналу,
     ігноруючи регістр символів), і false в іншому випадку. Метод reverse приймає рядок як аргумент і повертає його
     реверснуту копію. Це досягається за допомогою створення об'єкту класу StringBuilder зі словом, виклику
    методу reverse() для перевернення його, а потім перетворення на рядок за допомогою методу toString().
     */

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}
