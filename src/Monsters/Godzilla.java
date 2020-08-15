package Monsters;

public class Godzilla extends HorribleMonster implements Monster {
    @Override
    public void destroy() {
        System.out.println("I'm going to destroy!");

    }

    @Override
    public void kill() {
        System.out.println("I'm going to kill!");

    }

    @Override
    public void scareChildren() {
        System.out.println("I'll scare children!");

    }
}
