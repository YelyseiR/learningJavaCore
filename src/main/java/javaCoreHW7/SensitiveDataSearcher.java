package main.java.javaCoreHW7;

public class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveData = {"pass", "key", "login", "email"};
        for(String data : sensitiveData) {
            if(phrase.toLowerCase().contains(data)) {
                return true;
            }
        }
        return false;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}