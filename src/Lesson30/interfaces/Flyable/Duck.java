package Lesson30.interfaces.Flyable;

public class Duck implements Swimmable , Flayable {

    @Override
    public void fly() {
        System.out.println("Duck fly ");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
