package main.java.javaCoreHW7;

class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result.append(word);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

            /*
            StringBuilder - це клас, який дозволяє створювати та змінювати рядки без створення нових об'єктів рядка.
            Він ефективніший у випадку, коли необхідно додавати або змінювати рядок декілька разів, оскільки не створюється
             новий об'єкт рядка кожного разу при зміні.

            Метод append використовується для додавання рядків до StringBuilder. У цьому коді він використовується для
            додавання кожного слова до результату, який зберігається у StringBuilder. Також він додає пробіл після кожного
             слова, якщо це не останнє слово.
             */

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}