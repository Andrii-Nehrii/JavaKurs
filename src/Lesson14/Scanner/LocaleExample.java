package Lesson14.Scanner;

import java.util.Scanner;

/*public class Locale {
    public static void main(String[] args) {
        String data = "3,14 42,7";
        Scanner sc = new Scanner(data);
        //locale - используеться локаль пк для определения формата чисел
        // в том числе для дробей
        System.out.println(Locale.getDefault());
   */
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        // Получение текущей локали
        Locale currentLocale = Locale.getDefault();
        System.out.println("Current Locale: " + currentLocale);

        String text = "42,Java,3.14,Hello";
        Scanner scaner = new Scanner(text);
        scaner.useLocale(Locale.US);
        scaner.useDelimiter(",");


        System.out.println(scaner.nextInt());
        String java = scaner.next();
        System.out.println(java);
        System.out.println(scaner.nextDouble());
        System.out.println(scaner.next());








    }
}


