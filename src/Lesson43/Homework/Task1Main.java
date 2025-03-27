package Lesson43.Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1Main extends Task1 {
    public static void main(String[] args)  {
        List<Integer> l1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> l2 = new LinkedList<>(List.of(5, 6, 7, 8, 9));



        getTheSameInteger(l1 , l2 );
        System.out.println(l1);
        System.out.println(getTheSameInteger(l1 ,l2));






    }


}
