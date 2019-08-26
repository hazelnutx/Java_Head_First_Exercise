public class RowBoat extends Boat {
    public void rowTheBoat() {
        System.out.println("stroke natasha");
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.println("drift ");
    }
}
