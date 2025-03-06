package Lesson28.StaticPolymorphism.Animals;



public class CastingExample {
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

    }
    public  static void test(Animal animal){
        animal.voice();
    }


}
