package main.java.javaCoreHW6;

class RectangleArea{
    int area;
    public RectangleArea(int[] coords){
        area = Math.abs((coords[2] - coords[0]) * (coords[3] - coords[1]));
    }
    public int getArea(){
        return area;
    }
}
public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
