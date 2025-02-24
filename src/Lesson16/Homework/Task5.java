package Lesson16.Homework;
/*
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

import java.util.Random;

public class Task5 { public static void main(String[] args) {
    int[] array = new int[5];
    Random random = new Random();



    int i = 0;
    int min = array[i];
    int max = array[i];

    while (i < array.length) {
        array[i] = random.nextInt(100) - 50;
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];
        }
        System.out.print(array[i] + " ");
        i++;
    }

    System.out.println("\nМинимальное значение: " + min);
    System.out.println("Максимальное значение: " + max);
}
}



