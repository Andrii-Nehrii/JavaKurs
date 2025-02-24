package Lesson15.Homework;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);
        int num4 = random.nextInt(100);
        System.out.println("Случайные числа:");
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
        System.out.println("Число 4: " + num4);

        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("Максимальное: " + max);

    }
}
