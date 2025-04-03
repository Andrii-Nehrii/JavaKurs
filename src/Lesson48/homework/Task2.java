package Lesson48.homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Java" , "Python" , "Tiger" , "Hamburg","M" ,"Min", "Maaaaaaaaaaaaaax");
        String filteredStr = strings.stream()
                .min(Comparator.comparing(String::length))
                .orElseThrow(null);
        System.out.println(filteredStr);

    }
}
