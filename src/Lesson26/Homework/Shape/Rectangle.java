package Lesson26.Homework.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected  double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }


   public void setDimensions(double width , double height){
        this.height = height;
        this.width = width;

    }
    public void calkulateArea(){
        double area = height * width;
        System.out.println(area);
    }


}
