package Lesson28.StaticPolymorphism.Animals;

public class ZooApp {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.voice();
        cat.eat();
        System.out.println(cat.toString());
        cat.voice();
        Dog dog = new Dog();
        dog.voice();
Object object = new Object();
        Hamster hamster = new Hamster();
        hamster.toString();
        System.out.println(hamster.toString());
    }

}
