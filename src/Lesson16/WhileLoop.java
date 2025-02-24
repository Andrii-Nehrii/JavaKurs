package Lesson16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (условие) {
          // Тело цикла
          // Код который будет возвращаться
          }
          - условие - выражение которое возвращает true или false
          - Блок кода внутри {} (тело цыкла) выполняеться пока условие истинно.

          Предикат - условие вычисляеться переде каждой итерацией цикла

         */
      //Вывести на экран числа о 1 до 5
        int num = 1;
        while (num <= 5){
            System.out.println(num + ", ");
            num++;
        }
        int num2 = 100;
        while (num2 >= 90){
            System.out.println(num2 + ", ");
            num2--;
        }
        int y = 0;
        int num3 = 1;
        while (num3 <= 100){

        y = y + num3;
            num3++;
           // System.out.println(y);
        }

        int i = 1;
        int sum =0;
        while (i <= 100){

            sum += i ;//?
            i++;
            System.out.println(sum);
        }
     String str = "Hello";
     i = 0;
     while (i < str.length()){
         char ch = str.charAt(i);
         System.out.println(ch);
         i++;
     }
     i = 0;
     while (i < str.length()){
         System.out.println(str.charAt(i++));
     }

        Scanner scanner = new Scanner(System.in);
        System.out.println("num > 0: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        while (input <=0 ){
            System.out.println("num > 0: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }


        do{
            System.out.println("num > 0 : ");
            num = scanner.nextInt();
            scanner.nextLine();
        }while (num <= 0);

        System.out.println("Спасибо");



    }
}
