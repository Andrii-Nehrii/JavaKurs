package Lesson16.Homework;

public class Task1 {
    public static void main(String[] args) {
        /*
        Найдите произведение всех чисел от 1 до 15 включительно.
         Результат выведите на экран
         */
        long num = 1;
        long i = 1;
        while (i <= 15){
            num = num * i;
            System.out.println(num);
            i++;

        }
        //VSystem.out.println(num);

    }
}
