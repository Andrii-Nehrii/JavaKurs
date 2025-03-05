package Lesson27;

import java.util.Arrays;

public class Autobus {
    private static int counter = 1;
    // Уникальный идентификатор обьекта
    private final int id;

    private BusDriver driver;
    private Autopilot autopilot;

    private final int capacity;
    private int countPassanger;

    private final Passenger[] passengers;

    public Autobus( BusDriver driver , int capacity) {
        this.id=counter++;
        this.capacity = capacity;
        this.driver = driver;
        this.autopilot = new Autopilot("Автопилот версия 001");
        this.passengers = new Passenger[capacity];
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id +
                ", driver=" + driver.toString() +
                ", autopilot=" + autopilot.toString() +
                ", capacity=" + capacity +
                '}';
    }
    public void showListPassangers(){

        if (countPassanger == 0 ){
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassanger; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassanger - 1 )?", " : "]" );


        }
        System.out.println(sb.toString());
    }

    public boolean takePassanger(Passenger passenger){
        if (passenger == null)return  false;
        if (countPassanger < capacity){
            if (isPassangerInBus(passenger)){
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n",
                        passenger.getId() , this.id );
                return false;
            }
            passengers[countPassanger] = passenger;
            countPassanger++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус c id %d\n",
                    passenger.getId(), this.id);
            return true;

        }
        System.out.println("Мест нет");
        return false;
    }
    private  boolean isPassangerInBus(Passenger passenger){
        for (int i = 0; i < countPassanger; i++) {
            if(passengers[i].getId() == passenger.getId()){
                return true;
            }

        }
        return false;
    }


    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassanger() {
        return countPassanger;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }
}
