package Lesson27;

public class Application {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John" , "LN -12312");
        Autobus bus = new Autobus(busDriver , 15);
        System.out.println(busDriver.toString());

        BusDriver busDriver1 = new BusDriver("Margo" , "Ar - 234234");
bus.showListPassangers();

Passenger john = new Passenger("John");
        Passenger mario= new Passenger("MArio");
        Passenger jane = new Passenger("Jane");
       bus.takePassanger(john);
        bus.takePassanger(john);
       bus.takePassanger(mario);
       bus.takePassanger(jane);

        System.out.println(bus.getCountPassanger());
        bus.showListPassangers();



    }
}
