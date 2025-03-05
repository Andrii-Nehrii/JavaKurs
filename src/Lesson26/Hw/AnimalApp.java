package Lesson26.Hw;

public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака");
        dog.toStrings();
        dog.run();

        Cat cat = new Cat("Кот");
        cat.toStrings();
        cat.sleep();



    }
}
