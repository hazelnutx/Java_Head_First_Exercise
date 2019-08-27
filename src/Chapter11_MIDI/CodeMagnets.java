package Chapter11_MIDI;

class MyEx extends Exception {

    public static void main(String[] args) {
        String test = "yes";

        try {
            System.out.print("w");
            doRisky(test);
            System.out.print("s");
        }catch (MyEx ex){
            System.out.print("w");
        }finally {
            System.out.print("r");
        }
    }
    static void doRisky(String t) throws MyEx {

        System.out.print("h");
        if("yes".equals(t)){
            throw new MyEx();
        }
        System.out.print("a");
    }
}
