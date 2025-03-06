package Lesson28.StaticPolymorphism;

public class MathOperations {

    //статический(перегрузка) все 3

    static  int sum( int a , int b ){
        return a+b;
    }

    static double sum( double a , double b ){
        return a + b;
    }
    static double sum (int a , int b ,int c ){
        return a + b + c;

    }






    public static void main(String[] args) {
        System.out.println(sum(1 ,2 ));
    }


}
