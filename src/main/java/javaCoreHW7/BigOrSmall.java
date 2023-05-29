package main.java.javaCoreHW7;

class BigOrSmall {
    public String calculate (String text){
        int smallLetterCount = 0;
        int bigLetterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c == ' '){
                continue;
            }
            if(Character.isLowerCase(c)) {
                smallLetterCount++;
            } else if (Character.isUpperCase(c)) {
                bigLetterCount++;
            }
        }
        if(smallLetterCount > bigLetterCount){
            return "Small";
        } else if (bigLetterCount > smallLetterCount) {
            return "Big";
        } else {
            return "Same";
        }
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}