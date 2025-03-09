package Lesson29.abstracts;

public class Cat extends Animal{
    @Override
    void move() {
        System.out.println("кот передвигаеться");
    }

    @Override
    void eat() {
        System.out.println("Кот очень любит кушать");
    }
}
