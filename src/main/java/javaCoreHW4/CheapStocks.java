<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String result = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] stock = stocks[i].split(" ");
            int price = Integer.parseInt(stock[1]);

            if (price < 200) {
                result += stock[0] + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CheapStocks cheapstocks = new CheapStocks();
        System.out.println(cheapstocks.getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200", "dfd 25", "dcwdws 170"}));
    }
}
