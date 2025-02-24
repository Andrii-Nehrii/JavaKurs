package Lesson15;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5)+1;
        System.out.println(" get" + note);
        switch (note){
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;

        }
        System.out.println(money);
        System.out.println("У меня есть загадка");
        System.out.println("Что это : желтый, большой, с рогами и полный зайцев");

        String answer = scanner.nextLine();

        String answerClean = answer.trim().toLowerCase();
        switch (answerClean){
            case "Тролейбус":
            case "тролейбус":
                System.out.println("yes");
                break;
            case "сдаюсь":
            case "Сдаюсь":
                System.out.println("Быстро ты сдался ответ тролейбус");
                break;
            default:
                System.out.println("Ответ неверный, попробуй еще раз");

        }





    }

}
