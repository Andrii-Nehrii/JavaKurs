package Lesson27.Homework;

public class Component {
    protected String brand;
    protected String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String getInfo(){
        return "Model: " + model + "Brand: " + brand;
    }
}
