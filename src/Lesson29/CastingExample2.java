package Lesson29;


import Lesson28.StaticPolymorphism.Animals.Animal;
import Lesson28.StaticPolymorphism.Animals.Cat;
import Lesson28.StaticPolymorphism.Animals.Dog;
import Lesson28.StaticPolymorphism.Animals.Hamster;

public class CastingExample2 {
    public static void main(String[] args) {
        Animal animal = new Cat();

        /*
        тип ссылочной переменной определяет две вещи
        1. ссылки каких типов могут храниться в этой переменной
        2.Список методов которые можно вызвать обрашаясь к этой переменной
         */
        //Ссылочная переменная может хранить обьект своего класса или любого ребенка

        animal.voice();

        Animal animal1 = new Hamster();
        animal1.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
        animals[i].voice();

        }

        Animal animalD = new Dog();
        Dog dog = (Dog) animalD;
        dog.bark();

        Animal animalCat = new Cat();
       // Dog dog1 = (Dog) animalCat;
        //dog.bark();

        System.out.println("===========================\n");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();

            if (currentAnimal instanceof Cat){
                System.out.println("В ячейке " + i + "is a Cat type");
            }

        }
        if (animal instanceof Cat){
            System.out.println();
        }


    }
    public  static void test(Animal animal){
        animal.voice();

    }


}
