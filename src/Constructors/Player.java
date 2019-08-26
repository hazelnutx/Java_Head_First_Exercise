package Constructors;

public class Player {
    static int countPlayer = 0;
    private String name;

    Player(String n) {
        name = n;
        countPlayer++;
    }

    public static void main(String[] args){
        System.out.println(Player.countPlayer);
        Player x = new Player("Raul");
        System.out.println(Player.countPlayer);
        Player y = new Player("Raul");
        System.out.println(Player.countPlayer);
    }
}
