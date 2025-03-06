package Lesson28.StaticPolymorphism.Homework;

public class Pro  extends People{
    int running = 25;
    int pause = 5;

    @Override
    public String run() {
        return "Я спротсмен-профи " + super.run();
    }
}
