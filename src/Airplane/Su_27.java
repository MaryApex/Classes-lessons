package Airplane;

import java.util.Random;

public class Su_27 extends Airplane_Control implements Super_Powers {

    public Su_27(int length, int width, int weight) {
        super(length, width, weight);
    }

    @Override
    public int turboSpeed() {
        Random randomSpeed = new Random();
        int randomTurboSpeed = randomSpeed.nextInt(1000-0)+1000;
        return randomTurboSpeed;
    }

    @Override
    public void technoStells() {
        Random randomTime = new Random();
        int invisibleTime = randomTime.nextInt(100);
        System.out.println("The airplane is invisible during " + invisibleTime + " minutes." );

    }

    @Override
    public void nuclearHit() {
        Random randomRocket = new Random();
        int nuclearRocket = randomRocket.nextInt(10);
        System.out.println(nuclearRocket);
    }
}
