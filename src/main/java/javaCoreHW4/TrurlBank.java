<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class TrurlBank {

    public int sumSquads(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i*i;
            i++;
        }
        return sum;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
