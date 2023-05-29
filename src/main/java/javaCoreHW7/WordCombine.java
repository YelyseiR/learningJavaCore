package main.java.javaCoreHW7;

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        if(sourceWord.isEmpty() || targetWord.isEmpty()){
            return false;
        }
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        for (char c : targetWord.toCharArray()){
            if(!sourceWord.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
