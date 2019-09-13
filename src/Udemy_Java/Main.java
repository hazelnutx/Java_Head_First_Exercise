package Udemy_Java;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConverstion(10.5);
    }
}