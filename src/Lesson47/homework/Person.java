package Lesson47.homework;

import java.util.Objects;

public class Person {
    private  String city;
    private  String name;
    private  int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(city, person.city) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String city, String name, int age) {
        this.city = city;
        this.name = name;
        this.age = age;
    }
}
