package Lesson26.Transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-X1" , 2020 , 10);

        String str = bus.toString();
       System.out.println(str);
        System.out.println(bus);
        bus.start();
        bus.stop();
        System.out.println(bus.getModel());
        System.out.println(bus);
        System.out.println("capacity "+ bus.getCapacity());

        System.out.println("====================");

        Train train = new Train("Skoda", 2022 , 7 , 25);

        System.out.println(train.toString());
        train.start();
        train.stop();
        System.out.println("capacity: "+ train.getCapacity());
        train.setCountWagons(10);
        System.out.println("capacity: "+ train.getCapacity());


        Bus bus2 = new Bus("Bus- X2" , 2025 , 3);
        System.out.println(bus2.takePassanger());
        System.out.println(bus2.takePassanger());
        System.out.println(bus2.takePassanger());
        System.out.println(bus2.takePassanger());

    }
}
