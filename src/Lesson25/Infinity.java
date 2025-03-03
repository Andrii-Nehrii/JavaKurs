package Lesson25;

public class Infinity {
    public static void main(String[] args) {

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        double res = inf1 / inf2;
        System.out.println(res);
        System.out.println(inf1);

    }
}
