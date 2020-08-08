package Animal_Task_1;

public class Main {
    public static void main(String[] args) {

        Cat tom = new Cat();
        tom.color = "white";
        tom.run ();
        tom.play();
        tom.catchMouse();

        Jaguar wildJaguar = new Jaguar();
        wildJaguar.hunt();
        wildJaguar.eat();
        wildJaguar.color = "brown";



    }
}
