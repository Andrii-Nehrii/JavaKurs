package Lesson21.Homework;

public class Friend {
    String name;
    int age;
    String hobby;

    public Friend(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    void info() {
        System.out.println("Я твой друг!");
        System.out.println("Меня зовут " + name + ". Мне " + age + " лет.");
        System.out.println("Я люблю " + hobby + ".");
    }


}
