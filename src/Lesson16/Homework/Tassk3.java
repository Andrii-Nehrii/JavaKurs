package Lesson16.Homework;

import java.util.Scanner;

public class Tassk3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово 'hello':");
        String input = "";


        while (!"hello".equals(input)) {
            input = scanner.nextLine();

            if (!"hello".equals(input)) {
                System.out.println("Неправильно попробуйте ещё раз:");
            }
        }

        System.out.println("Вы ввели правильное слово.");
        scanner.close();

    }
}
