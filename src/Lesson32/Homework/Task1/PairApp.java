package Lesson32.Homework.Task1;

public class PairApp {
    public static void main(String[] args) {


        Pair<String> str = new Pair<>("Helo", "World");
        System.out.println(str.getFirst());
        System.out.println(str.getSecond());
        str.swap();
        System.out.println(str.getFirst());
        System.out.println(str.getSecond());
    }
}
