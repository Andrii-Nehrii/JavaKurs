package Lesson48.homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 25, 18, 42, 7, 11, 29, 34, 13, 56);
        List<Integer> filteredNum = numbers.stream()
                .filter(number -> number < 10)
                .sorted(Comparator.comparing(num -> num % 10))
                .collect(Collectors.toList());
        System.out.println(filteredNum);

    }
}
