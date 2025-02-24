package Lesson18;

public class MethodWithReturn {
    public static void main(String[] args) {
        int sum = calculateSum(10 ,5);
       sum = calculateSum(10 ,5 ) + calculateSum(20 ,30);//sum = 15+50 =65
        System.out.println(sum);

    }//end main

    public static int calculateSum(int a , int b){
        int result = a + b;
        System.out.println(result);
        return result;//return - оператор заканчивающий работу метода и возварщает значение




    }


}
