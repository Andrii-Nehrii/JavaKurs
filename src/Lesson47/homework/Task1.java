package Lesson47.homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = getListInteger();
        task1();
    }

    private static List<Integer> getListInteger() {
        return List.of(1, 8, 15, 77, 2, 122, 66, 43);
    }

    private static void task1() {
        List<Integer> integers = getListInteger();

        List <Integer> integerStream = integers.stream()
                .filter(integer -> integer > 10 && integer < 100)
                .filter(integer -> integer % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(integerStream);



    }

}
