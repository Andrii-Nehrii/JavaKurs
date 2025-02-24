package Lesson17.Homework;

public class Task3 {
    public static void main(String[] args) {
    int y = 3 ;
    numPower(y);


    }//end main
    public static void numPower(int x){
        if (x == 0){
            System.out.println(1);

        }
        if (x < 0){
            x = x * -1;
        }
        int sum = 2;
        for (int i = 0; i < x ; i++) {
            int num = 2;


            sum = sum * num;
            System.out.println(sum);

        }



    }
}
