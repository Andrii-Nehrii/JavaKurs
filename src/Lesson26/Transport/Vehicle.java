package Lesson26.Transport;

public class Vehicle {
    private String model;
    private int year;


    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return model + ", year of manufacture: "+ year;
    }


    public void start(){
        System.out.println(model + "Начинает движение");
    }

    public void stop(){
        System.out.println(model + "stop");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
