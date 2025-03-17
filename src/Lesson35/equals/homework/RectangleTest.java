package Lesson35.equals.homework;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5.0 , 3.0);
        Rectangle rectangle2 = new Rectangle(5.0 , 3.0);
        Rectangle rectangle3 = new Rectangle(4.0,2.0);
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
        System.out.println("rectangle1.equals(rectangle2)" + rectangle1.equals(rectangle2));
        System.out.println("rectangle2.equals(rectangle3)" + rectangle2.equals(rectangle3));


    }
}
