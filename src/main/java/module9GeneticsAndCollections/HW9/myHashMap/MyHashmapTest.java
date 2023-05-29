package main.java.module9GeneticsAndCollections.HW9.myHashMap;

public class MyHashmapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        System.out.println(map.get("one")); // 1
        System.out.println(map.get("three")); // 3

        map.remove("three");

        System.out.println(map.get("three")); // null

        map.clear();

        System.out.println(map.size()); // 0
    }
}
