<<<<<<< HEAD
package main.java.javaCoreHW5;

=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)
abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();

}
class RegularPassenger extends Passenger{
    public String getType(){
        return "Regular";
    }
    public int getTicketPrice(){
        return 199;
    }
}
class VIPPassenger extends RegularPassenger {
    public String getType() {
        return "VIP";
    }

    public int getTicketPrice() {
        return 399;
    }

    public static void main(String[] args) {
        Passenger regular = new RegularPassenger();
        System.out.println(regular.getType()); //Regular
        System.out.println(regular.getTicketPrice()); //199

        Passenger vip = new VIPPassenger();
        System.out.println(vip.getType());  //VIP
        System.out.println(vip.getTicketPrice()); //399
    }
}