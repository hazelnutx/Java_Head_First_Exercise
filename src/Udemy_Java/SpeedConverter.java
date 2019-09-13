package Udemy_Java;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometerPerHour / 1.609);
        }
    }

    public static void printConverstion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long convertMiles = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + convertMiles + " mi/h");
        }

    }
}