<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class ArlanHelper {

    public String drawQuad (int n) {
        StringBuilder quad = new StringBuilder();
        int vertical = 1;
        while (vertical <= n) {
            int horizontal = 1;
            while (horizontal <= n) {
                quad.append("*");
                horizontal++;
            }
            quad.append("\n");
            vertical++;
        }
        return quad.toString();
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int lines = height;

        while (lines > 0) {
            lines --;

            int columns = width;
            while (columns > 0) {
                result += c;
                columns--;
            }
            result += "\n";
        }
        return result;
    }

    public String drawLine(int length) {
        StringBuilder line = new StringBuilder(); /*створємо об'єкт  StringBuilder - це клас, який представляє собою
        змінний рядок символів. Він дозволяє змінювати рядок без створення нового об'єекту, що дозволяє
        оптимізувати використання пам'яті та збільшити швидкість виконання програми. Строки, відмінні від StringBuilder,
        не можуть бути змінені після створення, тому кожна зміна рядка вимагає створення нового об'єекту рядка.
        StringBuilder надає методі для додавання, вставки, заміни та видалення символів з рядка
        */
        int i = 0;

        while(i < length) {
            line.append(i % 2 == 0 ? '*' : '#'); /* Метод `append()` є одним з методів класу `StringBuilder` він дозволяє
            додавати символи, рядки, будь-який інший об'єект до кінця поточного рядка. Оскільки StringBuilder є змінним
            рядком, використання методу `append()` дозволяє додавати символи до рядка
            без створення нового об'єкту. Замість цього метод додає символи безпосередньо до поточного рядка, що
            забезпечує оптимізацію використання пам'яти та швидкість виконання програми.
            */
            i++;
        }
        return line.toString();
    }

    public String drawPattern(char[] pattern, int repeatCount){
        String patterns = new String(pattern);
        StringBuilder repeatedElements = new StringBuilder();
        int i = 0;

        while(i < repeatCount) {
            repeatedElements.append(patterns);
            i++;
        }
        return repeatedElements.toString();
    }


    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}

