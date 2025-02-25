package Lesson21.Homework;

import java.util.Scanner;

public class Teacher {
    String name;
    String subject;
    int experiens;
    Scanner scanner = new Scanner(System.in);


    public Teacher(String name, String subject, int experiens){
        this.name = name;
        this.subject = subject;
        this.experiens = experiens;
    }
    void info(){
       if(experiens > 0){ System.out.println("My name is "+ name + ". I can teach you " + subject + ". I've explained " + subject+ " "+ experiens + " times!");
        System.out.println();}else{
           System.out.println("Sorry i cant teach you "+ subject);
       }
    }
    void lerning(){
        System.out.println("I know a lot more than just"+ subject +" What are you interested in?");
        subject = scanner.nextLine();
        experiens = 0;
        //if (subject != "Math" ){
        //experiens = 0;}Хотел что то типа такого сделать, но не смог сделать это с equals
        System.out.println();

    }
    void  teaching(){
        System.out.println("Let's have a lesson together.");
        experiens++;
        System.out.println();
    }


}
