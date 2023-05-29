package main.java.module9GeneticsAndCollections;

    /*  Generic (узагальнення) - це особливі засоби Java, що дозволяють писати алгоритми, що працюють з різними
     типами даних без зміни вихідного коду методів та класів, які працюють з цими даними.

В Java для цього в певних місцях ми пишемо кутові дужки <>, де вказуємо типи даних. Далі у коді ми працюємо вже з цими
типами даних, які ми описували у кутових дужках.

Generic працює тільки з посилальними типами, він не може працювати з примітивами - int тощо.

    */
class KeyValuePair<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}

class KeyValueTest {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> javaSalary = new KeyValuePair<String, Integer>();
        KeyValuePair<Integer, Float> yearAvgTemperature = new KeyValuePair<Integer, Float>();
        javaSalary.setKey("Java");
        javaSalary.setValue(5000);
        yearAvgTemperature.setKey(3200);
        yearAvgTemperature.setValue(15f);
        System.out.println(javaSalary +"\n"+ yearAvgTemperature);
    }
}

