package Lesson14.Scanner.Homework;

public class Task4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
/*
Результат 1: 8 + 3 = 11 > 10 - true
Результат 2: 8 - 3 = 5 == 5 - true
Результат 3: 8 * 3 = 24 == 24 - true ,! меняет true на false
Результат 4: 8 / 3 = 2.6 > 2 - true
Результат 5: 8 % 3 = 0.6 == 2 - false
 */