<<<<<<< HEAD
package main.java.javaCoreHW5;
=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)

class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String result = "";
        int x = 1000;
        int y = 100;
        int z = 10;
        int star = 1;

        while (count > 0) {
            if (count >= x) {
                result += "X";
                count -= x;
                continue;
            }
            if (count >= y) {
                result += "Y";
                count -= y;
                continue;
            }
            if (count >= z) {
                result += "Z";
                count -= z;
                continue;
            }
            if (count >= star) {
                result += "*";
                count -= star;
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
