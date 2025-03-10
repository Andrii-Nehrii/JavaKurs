package Lesson30.interfaces.Flyable;

public abstract class Transport {
    int capacity;
    int amountPassangers;

    public Transport(int capacity) {
        this.capacity = capacity;
    }
    abstract boolean takePassanger();
    public int GetCapacity(){
        return capacity;
    }


}
