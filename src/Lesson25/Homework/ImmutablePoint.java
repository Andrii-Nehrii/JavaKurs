package Lesson25.Homework;

public class ImmutablePoint {
    final int x ;
    final  int y;

    public ImmutablePoint(int x, int y) {
        this.x = 10;
        this.y = 20;
    }
    // public void setX(double x);
   // this.x = x;
    //Нельзя изменить после инициализвции final.
}
