package Lesson42.Homework;

import Lesson42.Car;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmenMain {


    public static void main(String[] args) {
        Sportsman[] sportsmens = new Sportsman[5];
        sportsmens[0] = new Sportsman("Vlad", 12, 3);
        sportsmens[1] = new Sportsman("Anna", 19, 8);
        sportsmens[2] = new Sportsman("Oleg", 48, 9);
        sportsmens[3] = new Sportsman("Ilya", 30, 2);
        sportsmens[4] = new Sportsman("Paul", 17, 7);
        Arrays.sort(sportsmens);
        printSport(sportsmens);






        SportsmnComparatorScore comparatorScore = new SportsmnComparatorScore();
        Arrays.sort(sportsmens, comparatorScore);
        System.out.println(Arrays.toString(sportsmens));
        printSport(sportsmens);
        Arrays.sort(sportsmens, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman age1, Sportsman age2) {
               return age1.getAge() - age2.getAge();
            }
        });
        printSport(sportsmens);




















    }

    public static void printSport(Sportsman[] sportsmans) {
        System.out.println("============");
        for (Sportsman sportsman : sportsmans) {
            System.out.println(sportsman);
        }
        System.out.println("=========================\n");
    }
}
