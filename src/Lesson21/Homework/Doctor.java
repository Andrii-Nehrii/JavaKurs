package Lesson21.Homework;

public class Doctor {
    String name;
    int age;
    String specialization;

    public Doctor(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    void info() {
        System.out.println("Я врач.");
        System.out.println("Меня зовут " + name + ". Мне " + age + " лет.");
        System.out.println("Моя специализация: " + specialization + ".");
    }

}
