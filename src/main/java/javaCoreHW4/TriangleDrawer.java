<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class TriangleDrawer {
    public String drawTrianlge(int side) {
        StringBuilder triangle = new StringBuilder();
        int sideValue = side;

        while (sideValue > 0) {
            int value = sideValue;
            while (value > 0) {
                triangle.append("*");
                value--;
            }
            triangle.append("\n");
            sideValue--;
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        TriangleDrawer method = new TriangleDrawer();
        System.out.println(method.drawTrianlge(3));
    }
}
