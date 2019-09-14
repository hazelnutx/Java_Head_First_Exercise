package Udemy_Java;

public class SecondsToMinutes {
    public static void main(String[] args) {
        getDurationString(60, 10);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 && seconds > 59) {
            return "Invalid Value";
        }

        int getHours = (minutes + seconds) / 60;
        int remainderHours = getHours % 60;
        System.out.println(getHours + " h " + remainderHours + " m");
        return getDurationString(getHours, remainderHours);

    }
}