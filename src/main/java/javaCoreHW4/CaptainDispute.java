<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class CaptainDispute {
    public String evenOrOdd(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        CaptainDispute captainDispute = new CaptainDispute();

        //Should be even
        System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));
        }
}
