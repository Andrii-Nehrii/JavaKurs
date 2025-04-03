package Lesson48.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(3, 25, 18, 42, 7, 11, 29, 34, 13, 56);

       /* ArrayList<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n*2)
                .collect(Collectors.toCollection(ArrayList :: new));


        */
        List<Integer> numbersStream = numbers.stream()
                .filter(n-> n % 2 == 0)
               // .peek(System.out::println)
                .map(n-> n * 2)
                .collect(Collectors.toList());
        System.out.println(numbersStream);




    }
}
