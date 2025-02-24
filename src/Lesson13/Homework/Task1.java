package Lesson13.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("U name: ");
        String name =  scanner.nextLine();
        System.out.println(name);
        char first = name.charAt(0);
        char last = name.charAt(name.length() -1);
        System.out.println(first + " " + last );



    }
}
