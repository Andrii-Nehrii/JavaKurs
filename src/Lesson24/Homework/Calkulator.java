package Lesson24.Homework;


public class Calkulator {
    public static final double PI = 3.141592653589793;
   // double radius = 3.0;
    public static double plus(double a , double b ){
        return a + b;
    }

    public static double minus(double a, double b){
        return a - b;
    }
    public static double multiplication(double a , double b){
        return a * b;
    }
    public static double division(double a , double b){
        if (b == 0){
            System.out.println("Деление на 0 невозможно");
            return 0;
        }else {
            return a/b;
        }
    }
public  static  double  calkulateCiercleArea(double radius){
        return PI * radius *radius;
}
    public static double  calculateCircumference(double radius ){
        return 2 * PI * radius;
    }

}
