package Lesson21;

public class Cat {
    //Характеристики
    String name;
    String color;
    int age;

    //Конструктор
    public Cat() {

    }

    //конструктор
    public Cat(String catName) {
        name = catName;


    }

    public Cat(String catName, String color) {

        name = catName;
        this.color = color;

    }


    //Поведение обьектов
    public void sleep() {
        System.out.println("Я сплю.");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void run() {
        System.out.println("Я бегу");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s , возраст:%d, мой окрас %s\n", name, age, color);
    }


    public Cat(String name, String color, int age){
        this(name,color);//вызов другого конструктора класса
        //Вызов конструктора прнимающего двве String-и
        //Сначала будет выполнен код соответсивующего конструктора


        // this.name = name;
        //this.color = color;
        this.age = age;

    }


}
