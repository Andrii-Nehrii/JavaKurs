package Lesson30.interfaces.Flyable;

public class Airplane extends Transport implements Flayable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassanger() {
        if(amountPassangers < capacity){
            amountPassangers++;
            return  true;
        }return false;

    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");

    }
}
