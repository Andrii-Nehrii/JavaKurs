package Lesson15;

public class Start {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 5;
            x = x + y;
            System.out.println(x);
        }

        //x = x + y//невидно
        int y = 124;



    }
}
