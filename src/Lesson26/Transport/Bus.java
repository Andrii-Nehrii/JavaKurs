package Lesson26.Transport;


public class Bus extends Vehicle {
    private  int capacity;
    private int CountPassangers;

  /*  public Bus(){
        super();
    }

   */

    public Bus(String model, int year , int capacity ) {
        super(model, year);
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getCountPassangers() {
        return CountPassangers;
    }
    public boolean takePassanger(){
        if (CountPassangers < capacity){
            CountPassangers++;
            System.out.println("Пассажир зашел в автобус: " +this.getModel());
            return  true;
        }
        System.out.println("Больше мест нет");
        return false;
    }
//высадка
    public boolean dropPassanger(){
        if (CountPassangers > 0 ){
            CountPassangers--;
            return true;
        }
        System.out.println("Нет пассажиров");
        return false;
    }


}
