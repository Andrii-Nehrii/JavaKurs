package Lesson24.persons;

public class CarApp {
    public static void main(String[] args) {
        Car bmw = new Car("BMW" , 200);
        System.out.println("static total cars" +Car.totalCars);
        System.out.println("после создания 1 машины: " + bmw.toSttring());

        Car vw = new Car("VW" , 300);
        System.out.println(vw.toSttring());
        System.out.println("после создания 2 :"+ bmw.toSttring() );
        System.out.println("static variable: "+ Car.totalCars);


        //плохая практика
        //  System.out.println("vw.totalCars:"+ vw.totalCars);

        //следует
//static int x;

    }
}
