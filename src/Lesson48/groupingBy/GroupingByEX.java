package Lesson48.groupingBy;

import Lesson12.MainOperations;
import hw_rework.normale.ArrayEncapsTest;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByEX {
    /*
    Collectors.groupingBy(Funktion classifier) - простейшая форма группировки

     */
    public static void main(String[] args) {
        // task1();
        // task2();\
       // task3();
    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee("Petr", 2500, 25, "developer", "IT"),
                        new Employee("Silvia", 1500, 19, "traine", "IT"),
                        new Employee("Stefan", 2500, 30, "PM", "IT"),
                        new Employee("Olivia", 2500, 25, "manager", "Managment"),
                        new Employee("Sebastian", 3500, 28, "chef", "Managment"),
                        new Employee("Hanna", 2000, 35, "chef", "Cleaning"),
                        new Employee("Max", 1300, 45, "cleaner", "Cleaning"),
                        new Employee("John", 3200, 19, "chef", "IT")

                )
        );
        Map<String , List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament));
        System.out.println(".groupingBy(Employee::getDepartament : " );
        map.forEach((departament , employeeList)-> System.out.println(departament + ": " + employeeList));
        List<Employee> itList = map.get("IT");
        System.out.println("itList: " + itList);

        //
        Map<String , Set<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartament , Collectors.toSet()));

    }
   // private static  <K,V> void printMap(Map<K,V> map){
     //   map.forEach(k,v);
    //}

    private static void task2() {
        List<Integer> integers = List.of(1, 2, 3, -10, 105, 4, 6, -21, 0, 200, 140, 350);

        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> {
                    if (i == 0) return "Zero";
                    if (i < 0) return " Negative";
                    if (i % 2 == 0) return "Even";
                    return "Odd";
                }));
        System.out.println("Map: " + map);
        List<Integer> even = map.get("Even");
        System.out.println(even);
    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);


        Map<String, List<Integer>> map = integers.stream()
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "Even" : "Odd"));
    }


}
