package Lesson13;

public class PrintFormat {
    public static void main(String[] args) {
        double result = 20.0 / 7;
        int age = 25;
        String name = "Anna";
        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result );
        // printf()
        System.out.printf("Name: %s , Age: %d, score:%3f\n", name , 18 , result);
        System.out.println("Hello");
        // Место куда я хочу вставить значение переменной всегда помечаеться значком %
        /*
         после %  я должен указать тип данных
         %d - целое число (digit)
         %f - Число с плавающей точкой  (float)
         %s -  текст (strind - строка)
         */
        //souf -  print f



    }
}
