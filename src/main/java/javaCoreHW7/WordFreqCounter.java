package main.java.javaCoreHW7;

class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String[] words = phrase.split(" ");
        float count = 0;
        for(String element : words){
            if(element.equalsIgnoreCase(word)){
                count++;
            }
        }
        return count/words.length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}