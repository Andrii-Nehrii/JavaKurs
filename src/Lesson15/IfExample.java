package Lesson15;

import java.util.Random;

public class IfExample {
    public static void main(String[] args) {
        // if (условие) оператор;
        // if (){
        //  code
        //}

        int age = 10;
        if (age > 11) System.out.println("Вы совершеннолетний");

        System.out.println("Продолжение программы");

        if (age > 11){
            System.out.println("yo");
            System.out.println("yoo");
        } else  {
            System.out.println("Сейчас age =" + age);
        }
        Random random = new Random();
        int score = random.nextInt(100)+1;

        if (score > 90) {
            System.out.println("gooood " + score);
        }else if (score > 75){
            System.out.println("good " + score);
        } else if (score > 50) {
            System.out.println("norm " + score);
        }else {
            System.out.println("ploho " + score);
        }
        // min
        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51)-25;
        int v3 = random.nextInt(51);
        int r4 = random.nextInt(101)- 20;



    }
}
