package Lesson30.interfaces.Homework.Task1;

public class Triathlete implements Swiimer, Runner {
    @Override
    public void run() {
        System.out.println("Triathlete running");

    }

    @Override
    public void swim() {
        System.out.println("Triathlete swimming");
    }
}
