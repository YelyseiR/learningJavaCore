package main.java.javaCoreHW7;

class DigitText {
    public boolean detect(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}