<<<<<<< HEAD
package main.java.javaCoreHW5;
=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)

public class SpaceshipCalc {
    final int calculateAirBalloons(int passengerCount) {
        return passengerCount * 10;
    }

    public int calculateBookCount(int passengerCount){
        return passengerCount * 2;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
    }
}
