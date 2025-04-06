package Lesson49.validator;

import Lesson33.Person.Person;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.04.2025
 */

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@gmail.com", "qwerty");

        System.out.println(person);

        System.out.println("=============\n");

        Person person1 = new Person("john.gmail.com", "qwerty");
        System.out.println(person1);
    }
}
