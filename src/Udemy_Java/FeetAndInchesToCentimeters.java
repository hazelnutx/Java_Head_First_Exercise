package Udemy_Java;

public class FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        calFeetAndInchesToCentimeters(5.7, 0);

        calFeetAndInchesToCentimeters(100);
    }

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 && inches > 12) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is euqal to " + feet + " feet and " + remainingInches + " inches.");
        return calFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
