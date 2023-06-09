package main.java.javaCoreHW6;

class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX; // Зберігаємо початкову координату X
        this.startY = startY; // Зберігаємо початкову координату Y
        this.endX = endX; // Зберігаємо кінцеву координату X
        this.endY = endY; // Зберігаємо кінцеву координату Y
    }
    public int getDistance() {
        double distance = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        return (int) Math.round(distance);
    }
}
    /* Метод `getDistance()` обчислює відстань між двома точками в декартовій системі координат,
ми обчислюємо відстань між точками, використовуючи формулу для відстані між двома точками в
декартовій системі координат. Задля цього ми використовуємо метод `Math.sqrt()` для обчислення квадратного кореня,
та метод `Math.pow()` для піднесення різниці координат до квадрату. Після цього, ми округлюємо результат
до найближчого цілого числа за допомогою методу `Math.round()`. Результат повертається як ціле число
за допомогою оператора `(int)`.
    `Math` - це клас в стандартній бібліотеці Java, який містить багато математичних методів.
    В нашому випадку ми використовуємо методи `sqrt` та `pow`.
    `Math.sqrt()` - це метод, який обчислює квадратний корінь з заданого числа.
    `Math.pow(x, y)` - це метод, який обчислює значення числа `x` у степені `y`.
        Декартова система координат - це система, що використовується для опису положення точок на площині.
    Він використовує формулу для відстані між двома точками: d = √((x₂ - x₁)² + (y₂ - y₁)²),
    де `(x₁, y₁)` та `(x₂, y₂)` - координати початкової та кінцевої точок відповідно, а `d` - відстань між ними.
    У цій системі кожна точка на плозині описується двома числами - координатами "х" та "у".
    Центр координат у декартовій системі розташовужться в точці (0, 0) де ось "х" перетинається з осью "у",
    Вісь "х" зазвичай відображається горизонтально, а вісь "у" - вертикально. За замовчуванням "х" збільшується вправо, а
    "у" збільшується вгору.
    Декартова система координат використовується для опису різних геометричних фігур, такиї як лінії, криві, кола, еліпси, трикутники,
    прямокутники та інші.
https://uk.wikipedia.org/wiki/%D0%94%D0%B5%D0%BA%D0%B0%D1%80%D1%82%D0%BE%D0%B2%D0%B0_%D1%81%D0%B8%D1%81%D1%82%D0%B5%D0%BC%D0%B0_%D0%BA%D0%BE%D0%BE%D1%80%D0%B4%D0%B8%D0%BD%D0%B0%D1%82


     */
public class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
