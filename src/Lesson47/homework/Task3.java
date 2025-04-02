package Lesson47.homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        task3();
    }

    private static List<Person> getPerson(){
        return List.of(
                new Person("Berlin" , "Anton" , 30),
                new Person("Hamburg" , "Oleg" , 40),
                new Person("Berlin" , "Andrii" , 11),
                new Person("Molln" , "Olga" , 1),
                new Person("Lubeck" , "Anna" , 55),
                new Person("Berlin" , "Tom" , 55)
        );
    }
    private static void task3(){
        List<Person> persons = getPerson();

        List<Person> personStream = persons.stream()
                .filter(person -> person.getAge()>25)
                .filter(person -> person.getCity().equals("Berlin"))
               // .sorted(Comparator.comparing(Person :: getAge))
                .collect(Collectors.toList());
        System.out.println(personStream);
    }


}
