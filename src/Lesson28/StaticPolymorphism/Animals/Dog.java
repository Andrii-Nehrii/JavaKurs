package Lesson28.StaticPolymorphism.Animals;

public class Dog extends  Animal {

    @Override
    public String toString() {
        return super.toString() + "Dog";
    }

    public void bark(){
        System.out.println("dog bark");
    }
}
