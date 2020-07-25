package Rectangular;

public class Main {
    public static void main(String[] args) {
        Rectagle yellow = new Rectagle();
        yellow.width = 2;
        yellow.length = 3;

        System.out.println("Rectagle square is "+ yellow.square());
        System.out.println("Rectangle perimeter is " + yellow.perimeter());
    }
}
