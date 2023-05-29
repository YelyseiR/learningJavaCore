package main.java.javaCoreHW7;

class PunctuationMarkCounter {
    public int count (String phrase) {
        int countPuncMarks = 0;
        String str = phrase;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '!'  || str.charAt(i) == ','
                    || str.charAt(i) == ';' || str.charAt(i) == '.'
                    || str.charAt(i) == ':'){
                countPuncMarks++;
            }
        }
        return countPuncMarks;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
