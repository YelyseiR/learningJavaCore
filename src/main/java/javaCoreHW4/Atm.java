<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class Atm {
    public int countBanknotes (int sum){
        int[] banknotesInAtm = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
            while (sum > 0) {
                if (sum >= banknotesInAtm[i]) {
                    sum -= banknotesInAtm[i];
                    count++;
                } else {
                    i++;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        Atm counter = new Atm();
        System.out.println(counter.countBanknotes(500));
    }
}
