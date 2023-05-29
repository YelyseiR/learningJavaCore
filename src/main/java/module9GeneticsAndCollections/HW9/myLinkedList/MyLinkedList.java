package main.java.module9GeneticsAndCollections.HW9.myLinkedList;

public class MyLinkedList {
    private Node head; //перший елемент в колекції
    private Node tail; //останній елемент в колекції
    private int size; //розмір колекції

    private class Node {
        Object value; //Значення вузла
        Node next; //Наступний вузол
        Node prev; //Попередній вузол

        Node(Object value) {
            this.value = value;
        }
    }

    public void add(Object value) {
        Node newNode = new Node(value);

        if (head == null) { //Якщо список порожній, то нова нода - перша
            head = newNode;
        } else { //Якщо список не порожній, то додаємо нову ноду в кінець
            tail.next = newNode; //Зв'язав попередню останню ноду з новою
            newNode.prev = tail; //Зв'язав нову ноду з останньою
        }

        tail = newNode; //Нова нода стала останньою
        size++;
    }

    public void remove(int index) {
        Node current = getNodeByIndex(index);

        if (current == null) { //Якщо вузол не знайдено, нічого не видаляємо
            return;
        }

        Node prev = current.prev;
        Node next = current.next;

        if (prev == null) { //Якщо попередній вузол відсутній, то це перший вузол
            head = next; //Змінюємо посилання на початок списку
        } else {
            prev.next = next; //Встановлюємо зв'язок з наступним вузлом
            current.prev = null; //Звільняємо пам'ять, щоб уникнути утечок
        }

        if (next == null) { //Якщо наступний вузол відсутній, то це останній вузол
            tail = prev; //Змінюємо посилання на кінець списку
        } else {
            next.prev = prev; //Встановлюємо зв'язок з попереднім вузлом
            current.next = null; //Звільняємо пам'ять, щоб уникнути утечок
        }

        size--;
    }

    public void clear() {
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.prev = null;
            current.next = null;
            current.value = null;
            current = next;
        }

        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) { //повертає елемент за індексом
        Node node = getNodeByIndex(index);

        if (node == null) {
            return null;
        }

        return node.value;
    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size) { //Якщо індекс невірний, повертаємо null
            return null;
        }

        Node current;

        if (index <= size / 2) { //Якщо індекс ближче до початку списку, шукаємо з початку
            current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else { //Якщо індекс ближче до кінця списку, шукаємо з кінця
            current = tail;

            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }

        return current;
    }
}

/*
Усередині LinkedList є вкладений клас Node, який є елементом, що містить дані, а також посилання на наступний
елемент і прийде, власне LinkedList і працює на таких нодах.

Під вузлом в нода розуміється окремий елемент мережі, який може мати своє унікальне ідентифікаційне значення та
виконувати певні функції. Вузол може мати зв'язки з іншими вузлами та обмінюватись даними з ними. У контексті
 розподілених систем або мереж, вузол часто використовується для розподіленої обробки даних.

Нода в Java - це окремий вузол, що входить до складу деякої системи або мережі і виконує основні функції роботи з даними.
 Зазвичай, ноди використовуються для розподіленої обробки даних та спільної роботи декількох частин системи, щоб
 забезпечити високу ефективність та швидкість роботи. Кожна нода може мати власні особливості та може виконувати
 певні функції, такі як зберігання даних, обробка інформації або взаємодія з іншими нодами.

 */
