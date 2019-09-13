package Udemy_Java;

public class FeetAndInchesToCentimeters {
    public static void main(String[] args){
        calFeetAndInchesToCentimeters(5.7, 0);
    }

    public static double calFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 && inches > 12){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        return inches;
    }
}
