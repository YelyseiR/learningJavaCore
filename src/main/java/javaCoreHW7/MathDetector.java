package main.java.javaCoreHW7;

class MathDetector {
    public boolean isMath(String text) {
        if(text.contains("=") && text.matches(".*\\d.*\\d.*") && text.contains("+")
        || (text.contains("-")) || (text.contains("*") || text.contains("/"))) {
            return true;
        } else {
            return false;
        }
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}