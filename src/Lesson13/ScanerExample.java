package Lesson13;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // от пользователя через клавиатуру
        System.out.println("U name : ");
        //nextLine читает строку введенную пользователем
        String name = scanner.nextLine();
        System.out.println(name);


        System.out.println("U  age; ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(age);
        System.out.println("u town: ");
        String city = scanner.nextLine();
        System.out.println(city);


        // nextLine() читает до того моменьа пока не закончиться число, до пробела или еще ччего то
        // Разделитель - пробельный символ
        /*
        \s - пробельный символ
        - пробел
        - \tзнак табуляции(подряд)
        - перевод каретки
         */

        System.out.println("number PI : ");
        double p1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("PI " + p1);

    }
}
