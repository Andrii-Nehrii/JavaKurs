package Lesson30.interfaces.Flyable;

public class Aplication {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
        Flayable[] flayables = new Flayable[2];
        flayables[0] = duck;
        flayables[1] = airplane;
        for (int i = 0; i < flayables.length; i++) {
            Flayable flayable = flayables [ i];
            flayable.fly();

            //
            if(flayable instanceof  Swimmable){
                System.out.println("Могу привести этот оббект к Swimable");
                Swimmable swimmable = (Swimmable) flayable;
                swimmable.swim();
                System.out.println("==============\n");
            }
        //проверка
            if (flayable instanceof Airplane){
                System.out.println("Могу привести к самалету");
                Airplane airplanelink = (Airplane) flayable;
                System.out.println("Вместимость" + airplanelink.capacity);
                airplanelink.takePassanger();
                System.out.println("колво пассажиров: " + airplanelink.amountPassangers);

            }
        }

    }
}
