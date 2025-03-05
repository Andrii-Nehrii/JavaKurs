package Lesson26.Transport;

import Lesson13.PrintFormat;

public class Train extends Vehicle {
    private  int capacity;
    private int countPassangers;
    private int countWagons;
    private final  int wagonCapacity;


    public Train(String model, int year,  int countWagons, int wagonCapacity) {
        super(model, year);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calkulateCapacity();
    }

    private void calkulateCapacity(){
        this.capacity = countWagons * wagonCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassangers() {
        return countPassangers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
       this.countWagons = countWagons;
       calkulateCapacity();
    }
}
