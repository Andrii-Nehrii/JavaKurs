package Lesson33.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("test@gmail.net" , "password");

        person.setPassword("Andriy1_-1");
        System.out.println(person);
        person.setPassword("password");
        System.out.println(person);
        person.setPassword("Aiy1_-1");//меньше 8
        System.out.println(person);
        person.setPassword("Aiya_-a");//цифра
        System.out.println(person);
        person.setPassword("AIIII1_-1");//маленькая буква
        System.out.println(person);
        person.setPassword("aiy1_-1");//большая
        System.out.println(person);
        person.setPassword("Aiy1aaaa1");// спецсимвол
        System.out.println(person);
        person.setEmail("test@ma1.1il.net");
        System.out.println(person);
        person.setPassword("Andriy2_-2");

      //  person.setPassword("QWE4RTYqwwe%");
        System.out.println(person);

    }



}
