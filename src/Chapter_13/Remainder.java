package Chapter_13;

class Remainder {

    public static void main(String[] args) {
        double x = 20;
        double y = 80;
        double sum = (x + y) * 25;
        if (sum % 40 <= 20) {
            System.out.println("Total was over the limit");
        }

    }
}