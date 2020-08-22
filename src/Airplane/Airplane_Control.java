package Airplane;

import java.util.Random;

public class Airplane_Control extends Airplane {
  public int length;
    public int width;
    public int weight;

    public Airplane_Control (int length, int width, int weight){
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public int goUp() {

        Random random = new Random();
        int distance = random.nextInt(1000);
        return distance;

    }

    public int goDown() {
        Random random = new Random();
        int distance = random.nextInt(1000);
        return distance;

    }

    public int goStraight() {
        Random random = new Random();
        int distance = random.nextInt(1000);
        return distance;

    }

    public int goBack() {
        Random random = new Random();
        int distance = random.nextInt(1000);
        return distance;
    }

}
