package main.java.javaCoreHW7;

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for(int number : numbers) {
            result.append(number);
        }
        return result.toString();
    }
}
            /* Метод append класу StringBuilder дозволяє додавати різні типи даних такі як, рядки, символи, числа, тощо)
            до поточного рядка, який зберігається в об'єкті StringBuilder. Після кожного виклику методу append рядок, що
            додається - додається до рядку, який же є в StringBuilder. Це дозволяє додавати елементи до рядка без
            необхідності створювати новий об'єкт рядка з кожним додаванням.

            У цьому коді метод append використовується для додавання кожного числа з масиву намберс до об'єкту СтрінгБілдер.
            Після завершення цього циклу всі числа с об'єкту намберс будуть додані в СтрінгБілдер, що поверне рядок
            з усіма числами, які були в масиві.
            */

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}