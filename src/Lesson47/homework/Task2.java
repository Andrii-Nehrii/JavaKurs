package Lesson47.homework;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }
    private static void task2(){
        List<String> strings = List.of("Apple", "banana", "avocado", "Cherry", "apricot", "Blueberry");
        List<String> filteredStr = strings.stream()
                .filter(string -> string.toUpperCase().startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredStr);
    }
}
