<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class NumberTranslator {
    public int translate(String romanNumber) {
        romanNumber = romanNumber.trim().toUpperCase();
        int arabicNumber = 0;
        switch (romanNumber) {
            case "I":
                arabicNumber = 1;
                break;
            case "II":
                arabicNumber = 2;
                break;
            case "III":
                arabicNumber = 3;
                break;
            case "IV":
                arabicNumber = 4;
                break;
            case "V":
                arabicNumber = 5;
                break;
            case "VI":
                arabicNumber = 6;
                break;
            case "VII":
                arabicNumber = 7;
                break;
            case "VIII":
                arabicNumber = 8;
                break;
            case "IX":
                arabicNumber = 9;
                break;
            case "X":
                arabicNumber = 10;
                break;
            case "XI":
                arabicNumber = 11;
            break;

        }
        return arabicNumber;
    }
}