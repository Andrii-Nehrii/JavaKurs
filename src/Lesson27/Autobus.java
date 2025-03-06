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
       /* StringBuilder sb = new StringBuilder("Autobus: { id: ");
        sb.append(id).append(" ; capacity: ").append(capacity).append(" ; ").append(driver.toString());
        sb.append(" ; ").append(autopilot.toString()).append(" ; pasangers: ").append(countPassanger);
        sb.append(" }");
        return sb.toString() ;

        */
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
            if (isPassangerInBus(passenger) >= 0){
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
    private  int isPassangerInBus(Passenger passenger){
        for (int i = 0; i < countPassanger; i++) {
            if(passengers[i].getId() == passenger.getId()){
                return i;
            }

        }
        return -1;
    }

    public boolean dropPassanger(Passenger passenger){
        if (passenger == null || countPassanger == 0) return  false;
        int index = isPassangerInBus(passenger);

        if (index == -1){
            System.out.printf("Пассажир с id %d не в атобусе (%d) не найден!\n" , passenger.getId() , this.id );
            return false;
        }

        for (int i = 0; i < countPassanger; i++) {
            passengers[i] = passengers[i+1];


        }
        passengers[countPassanger - 1] = null;

        countPassanger--;
        System.out.printf("Пассажир (%d) dsitk bp fdnj,ecf %d" , passenger.getId() , this.id );
        return true;

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
//https://forms.gle/HkicwdBcVeyzjSHZA