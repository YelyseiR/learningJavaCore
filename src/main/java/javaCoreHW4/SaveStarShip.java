<<<<<<< HEAD
package main.java.javaCoreHW4;
=======
package javaCoreHW4;
>>>>>>> 855ebd8 (rebuilded project)
import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        } else {
            return new String[]{};
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if(distanceToEarth < 45677L){
            return "Earth";
        }
        return "Pern";
    }

    public int calculateFuelPrice(String fuel, int count){
        int price;
        switch(fuel){
            case "STAR100":
                price = 70;
                break;
            case "STAR500":
                price = 120;
                break;
            case "STAR1000":
                price = 200;
                break;
            default:
                price = 50;
                break;
        }
        return price * count;
    }

    public int roundSpeed(int speed) {
        int remainder = speed % 10;
        if (remainder >= 5) {
            return speed + (10 - remainder);
        } else {
            return speed - remainder;
        }
    }

    public int calculateNeededFuel(int distance) {
        int fuel = 1000;
        if (distance > 20) {
            fuel += 5 * (distance -20);
        }
        return fuel;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int engine1 = scanner.nextInt();
        int engine2 = scanner.nextInt();
        int engine3 = scanner.nextInt();

        int maxPower = Math.max(engine1, Math.max(engine2, engine3));
        float coefficient;
        if (maxPower < 10) {
            coefficient = 0.7f;
        } else if (maxPower <= 100) {
            coefficient = 1.2f;
        } else {
            coefficient = 2.1f;
        }

        float maxShipPower = maxPower * coefficient;
        System.out.println(maxShipPower);
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall ";
        }
        if (ticket % 10 == 7) {
            result += "chip ";
        }
        if (ticket > 200) {
            result += "coin ";
        }
        return result.trim();
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        int area = side1 * side2;
        int longerSide = Math.max(side1, side2);
        int shorterSide = Math.min(side1, side2);
        if (area >= 1500 && longerSide <= 2 * shorterSide && price / area <= 1000) {
            return true;
        } else {
            return false;
        }
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}
