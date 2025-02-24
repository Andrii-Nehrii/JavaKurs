package Lesson14.Scanner.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(scan);
        boolean ev = num % 2 == 0;
        boolean ev2 = num % 3 == 0;
        boolean ev3 = ev & ev2;

        System.out.println("Число: " + num +
                " четное: " + ev +
                "; кратно 3: " + ev2 +
                "; четное и кратное 3: " + ev3);




    }
}
