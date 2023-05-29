package main.java.javaCoreHW7;

public class StringByteWorker {
    public String process(byte[] bytes) {
        byte[] arr = bytes;
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word += Character.toString((char)arr[i]);
        }
        return word.toLowerCase();
    }
}

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}