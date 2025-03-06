package Lesson28.StaticPolymorphism.Homework.Task2;

public class Bicycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("У велика нет двигателя");
    }
}
