package Lesson28.StaticPolymorphism.Animals;

public class Cat extends Animal{
    public void eat(){
        System.out.println("кот кушает");

    }
    @Override
    public void voice(){
        System.out.println("Cat say MEOW!");
    }

}
