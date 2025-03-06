package Lesson28.StaticPolymorphism.Homework;

public class PeopleMain {
    public static void main(String[] args) {
        People people = new People();
        AmateurAthlete amateur = new AmateurAthlete();
        Pro pro = new Pro();


        System.out.println(people.run());
        System.out.println(amateur.run());
        System.out.println(pro.run());
    }
}
