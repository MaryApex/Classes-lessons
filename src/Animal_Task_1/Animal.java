package Animal_Task_1;

public class Animal {
    public String name;
    public int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("I like to run");
    }

    public void eat() {
        System.out.println("I want some food!");
    }
}
