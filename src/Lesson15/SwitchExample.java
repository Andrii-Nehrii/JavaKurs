package Lesson15;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("num; ");
        int num = scanner.nextInt();
        scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("u num 1");
            case 2:
                System.out.println(2);
            case 3:
            case 4:
                System.out.println("3 or 4");
            default:
                System.out.println("idk");
                break;
        }


       /* switch (num){
            case 1 -> System.out.println("2.1");
            case 2 -> System.out.println("2.2");
            case 3, 4 -> System.out.println("2.3,4");

        }
        String result = switch (num) {
            case 1 -> "3.1";
            case 2 -> "3.2";
            case 3 , 4 -> "3.3,4";


        */

        };;







    }

