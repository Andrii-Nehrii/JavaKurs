package Lesson32.Homework.Task3;

public class NummerParicApp {
    public static void main(String[] args) {
        NumericPair <Integer> numbers = new NumericPair<>(10 , 20);
        System.out.println(numbers.sum());

        NumericPair <Double> numers = new NumericPair<>(5.5 , 4.2);
        System.out.println(numers.sum());
    }
}
