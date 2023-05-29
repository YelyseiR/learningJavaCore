<<<<<<< HEAD
package main.java.javaCoreHW5;
=======
package javaCoreHW5;
>>>>>>> 855ebd8 (rebuilded project)

public class SpaceportMessages {
    public static String generateLandingMessage (String shipName, String spaceport, String time) {
        return "Spaceship " + shipName + " landing at " + spaceport + ", time is " + time;
    }

    public static void main(String[] args) {
        SpaceportMessages messages = new SpaceportMessages();
        System.out.println(SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40"));
    }
}
