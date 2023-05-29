package main.java.javaCoreHW7;

class PalindromeCounter {
    public int count(String phrase){
        int counter = 0;
        String [] words = phrase.toLowerCase().split("\\s+");

        for (String string : words){
            if (string == null){
                return 0;
            }
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(string)){
                counter++;
            }
        }
        return counter;
    }
}

//                              (StackOverFlow example)
//class PalindromeCounter {
//    public int count(String phrase) {
//        int count = 0;
//        for (int i = 0; i < phrase.length() - 1; i++) {
//            char start = phrase.charAt(i);
//            String st = "";
//            st += start;
//            for (int j = i + 1; j < phrase.length(); j++) {
//                st += phrase.charAt(j);
//                StringBuffer rev = new StringBuffer(st).reverse();
//                if(st.equals(rev.toString()) && st.length() > 1) {
//                    count++;
//                }
//            }
//            st = "";
//        }
//        return count;
//    }
//}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}