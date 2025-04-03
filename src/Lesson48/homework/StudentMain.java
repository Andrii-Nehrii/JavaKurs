package Lesson48.homework;

import Lesson48.groupingBy.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
      List  <Student> student = List.of(
                new Student("Oleg", 40, "IT", 1, 3.0),
                new Student("Oleg", 40, "IT", 1, 3.0),
                new Student("Oleg", 40, "Manager", 1, 3.0),
                new Student("Oleg", 40, "IT", 1, 3.0),
                new Student("Oleg", 40, "Manager", 1, 3.0),
                new Student("Oleg", 40, "Economy", 1, 3.0),
                new Student("Oleg", 40, "IT", 1, 3.0),
                new Student("Oleg", 40, "Economy", 1, 3.0),
                new Student("Oleg", 40, "Kollektor", 1, 3.0),
                new Student("Oleg", 40, "Med", 1, 3.0),
                new Student("Oleg", 40, "Med", 1, 3.0)
      );
        Map<String , List<Student>> listMap = student.stream()
                .collect(Collectors.groupingBy(Student :: getMajor));
        System.out.println(listMap);







    }
}
