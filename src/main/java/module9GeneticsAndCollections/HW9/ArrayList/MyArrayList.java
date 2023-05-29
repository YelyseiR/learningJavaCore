package main.java.module9GeneticsAndCollections.HW9.ArrayList;

import java.util.Arrays;
public class MyArrayList {
    private Object storage[]; // масив об'єктів для зберігання даних
    private int size; //розмір масиву

//    public MyArrayList() { //конструктор (закоментував та передав значення у мейн метод)
//        this(10);
//    }

    public MyArrayList(int initialCapacity) {
        try {
            if (initialCapacity < 0) throw new IllegalArgumentException("This capacity is not correct " + initialCapacity);
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException in MyArrayList. " + ex.getMessage());
            initialCapacity = 0;
        }
        storage = new Object[initialCapacity];
        size = 0;
    }
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 1;

    private void grow(int minCapacity) { //метод для збільшення розміру масиву у випадках коли передаються значення більше
        int oldCapacity = storage.length; //змінна зі значенням поточного масиву
        int newCapacity = oldCapacity * 2; // новий розмір масиву
        if (newCapacity - minCapacity < 0) { // перевіряємо чи достатньо місця для додавання нових елементів
            newCapacity = minCapacity; // якщо не достатньо, збільшуємо розмір масиву
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) { // перевіряємо чи не перевищений максимальний розмір масиву
            newCapacity = MAX_ARRAY_SIZE;  // якщо перевищено, задаємо максимальний розмір масиву
        }
        storage = Arrays.copyOf(storage, newCapacity); // створюємо новий масив об'єктів та копіюємо в нього вміст старого масиву
    }


    public void add(Object value) {  //додавання нового елементу у масив
        if (storage.length < size + 1) { // перевіряємо чи достатньо місця для зберігання нового елементу
            grow(size + 1); // якщо не достатньо, збільшуємо розмір масиву
        }
        storage[size++] = value; // додаємо новий елемент до масиву
    }

    public void remove(int index) { //метод видаляє елемент із вказаним індексом
        if (index >= size) {  // перевіряємо чи індекс виходить за межі списку
            throw new IndexOutOfBoundsException();  // якщо виходить, то викидаємо ексепшн
        }
        System.arraycopy(storage, index + 1, storage, index, size - index - 1);
        // копіюємо вміст масиву, починаючи з наступного елементу після видаляємого, до поточного індексу
        storage[--size] = null;  // видаляємо останній елемент з масиву
    }

    public void clear() { //очищає колекцію
        size = 0;
    }
    public int size() { //повертає розмір колекції
        return size;
    }
    public Object get(int index) { //повертає елемент за індексом
        return storage[index];
    }
}
