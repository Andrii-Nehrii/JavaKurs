package Lesson12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5; // x = x + 5
        x -= 2;
        x *= 2;
        x /= 5;
        System.out.println(x);

          // Инкремент , Декремент
        x++; // увеличить на 1

        System.out.println(x);

        x--; // Уменьшение
        System.out.println(x);
       // постфикс = х++ , х-- сначала значение а потом оно будет увеличено
       // префикс --х , ++х

       int var = 100;
        System.out.println("var = " + var++);
        System.out.println(var);
        int y = 100;
        System.out.println(++y);




    }
}
