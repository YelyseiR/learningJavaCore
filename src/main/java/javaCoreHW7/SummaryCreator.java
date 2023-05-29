package main.java.javaCoreHW7;

class SummaryCreator {
    public String create(String text) {
        if(text.length() <= 15) {
            return text;
        } else {
            String summaryText = text.substring(0, 15);
            if (text.charAt(15)!= ' ') {
                summaryText += "...";
            }
            return summaryText;
        }
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}