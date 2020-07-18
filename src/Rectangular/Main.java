package Rectangular;

public class Main {
    public static void main(String[] args) {
        Rectagle Yellow = new Rectagle();
        Yellow.width = 2;
        Yellow.length = 3;

        System.out.println("Rectagle square is "+ Yellow.square());
        System.out.println("Rectangle perimeter is " + Yellow.perimeter());
    }
}
