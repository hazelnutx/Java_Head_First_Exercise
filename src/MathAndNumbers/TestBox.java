package MathAndNumbers;

class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go(3);
    }

    public void go(int x) {
        i = x;
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}

