<<<<<<< HEAD
package main.java.javaCoreHW5;
=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)

public class LaunchCalculator {
    public int calculateTotalPrice(SpaceportSpaceport spaceportSpaceport, int passengerCount) {
        return spaceportSpaceport.calculateTotalPrice(passengerCount);
    }

    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice); //700

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice); //1500

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice); //2000
    }
}

abstract class SpaceportSpaceport {
    public abstract int calculateTotalPrice(int passengerCount);
}
class JupiterStar extends SpaceportSpaceport {
    public int calculateTotalPrice (int passengerCount) {
        return 500 + (passengerCount * 2);
    }
}
class MercuryBeat extends SpaceportSpaceport {
    public int calculateTotalPrice (int passengerCount) {
        return passengerCount * 15;
    }
}
class SunHeaven extends SpaceportSpaceport {
    public int calculateTotalPrice (int passengerCount) {
        return 2000;
    }
}
