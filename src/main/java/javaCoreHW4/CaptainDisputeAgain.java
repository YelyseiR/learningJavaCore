<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int min = triple[0];
        min = (triple[1] < min) ? triple[1] : min;
        min = (triple[2] < min) ? triple[2] : min;
        return min;
    }
}
