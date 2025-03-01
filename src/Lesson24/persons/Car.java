package Lesson24.persons;

public class Car {

    static int totalCars;

    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
        totalCars++;
    }





    public String toSttring(){
        return String.format("Auto : %s , power  %d всего: ", model , power,totalCars );
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }




}
