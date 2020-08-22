package Airplane;

import java.util.Random;

public abstract class Airplane {

    public int startEngine (){
        Random randomTime = new Random();
        int timeBeforeStart = randomTime.nextInt(88-20)+20;
        return timeBeforeStart;
    }
    public int takeOff(){
        Random randomTime = new Random();
        int fullTankDistance = randomTime.nextInt(1000-0)+0;
        return fullTankDistance;
    }
    public void landing(){
        System.out.println("The plane is landing");
    }
}
