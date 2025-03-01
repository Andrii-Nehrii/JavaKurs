package Lesson24.persons;

public class StaticExample {
    //non static

    int x;

    //Метод main статический

    // static поле класса
    static int staticY;

    // Статик метод
    public static void staticMethod(){
        //Статические методы видят ТОЛЬКО  статические члены (поля и методы) класса :
        // x++; нет доступа к не статическому полю
        staticY++;}


        // Не статический метод

        public void nonStaticMethod(){
        //есть доступ ко всем членам класса
            x++;
            staticY++;
    //можем вызывать статические и не статические методы
            //this не достпно в статик Методах
            staticMethod();
    }


    public static void main(String[] args) {
        //x = 10;// ошибка конпиляции. У статик метода не доступа к не статик переменной
       staticY = 10;
        System.out.println(staticY);

        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();// так можно

        StaticExample.staticMethod(); // так со статикой

        int sum = MathUtil.sumIntegers(1,2,5,6,7,8,9);
        System.out.println("сумма чисел: "  + sum);





    }




}
