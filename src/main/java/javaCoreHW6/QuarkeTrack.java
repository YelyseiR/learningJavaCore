package main.java.javaCoreHW6;

import java.util.Objects;

class QuarkeTrack {
    private int[] lines;  //оголошуємо приватне поле lines, яке містить масив чисел
    public QuarkeTrack(int[] lines) {
        this.lines = lines; //оголошуємо конструктор класу та ініціалізуємо приватне поле значенням аргументу конструктора.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuarkeTrack)) return false;
        QuarkeTrack that = (QuarkeTrack) o;
        return sum(this.lines) == sum(that.lines);
    }
    /*  Умова  if (this == o) return true; перевіряє, чи об'єкт  this (тобто поточний об'єкт) є тим самим об'єктом,
    що і об'єкт "о" який передається в метод equals(). Якщо це так, то повертається тру, оскільки об'єкти однакові.
        Умова if (!(o instanceof QuarkeTrack)) return false; перевіряє, чи об'єкт "о" є екземплятор класу QuarkeTrack,
    якщо ні, то повертається фолс, оскільки об'єкти різні.
        Далі оголошується змінна  типу QuarkeTrack з назвою that і присвоюється значення об'єкту "о".
        Потім порівнюється сума довжин поточного об'єкту this з сумою довжин об'єкту that. Якщо ці суми співпадають,
        то повертається тру, оскільки об'єкти однакові. Якшо ж ні, то повертається фолс, оскільки вони різні.
     */
    @Override
    public int hashCode() {
        return Objects.hash(sum(lines));
    }
        /*
        Цей метод `hashCode()` переводить об'єкт класу `QuarkeTrack` в ціле число (хеш-код).
        В обчисленні хеш-коду використовується метод `Objects.hash()`,
        який приймає список об'єктів і повертає хеш-код, згенерований на основі переданих об'єктів.
        У даному випадку, як параметр методу передається сума всіх елементів масиву `lines`, яку обчислює метод `sum()`.
        Це забезпечує унікальний хеш-код для кожного об'єкта `QuarkeTrack`,  який може бути використаний для
        швидкого порівняння об'єктів в колекціях, наприклад, в HashMap або HashSet.
        */
    private int sum(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    /*  Цей код визначає приватний метод sum(), який приймає масив чисел arr і повертає суму всіх його елементів.
    1) Створюється змінна sum, яка ініціалізується значенням 0.
    2) Виконується цикл for, який проходить по всіх елементах масиву arr/
    3) На кожній ітерації змінна num приймає значення поточного елемента масиву arr.
    4) До змінної sum додається значення змінної num/
    5)Після завершення циклу повертається значення змінної sum, яка є сумою всіх елементів масиву arr.
    Цей метод використовується в методі equals() для порівняння сум довжин пробіжок двох об'єктів QuarkeTrack.
     */
}
class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}
