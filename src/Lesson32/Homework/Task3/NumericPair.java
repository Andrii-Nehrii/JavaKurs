package Lesson32.Homework.Task3;

public class NumericPair <T extends Number> {
  private  T first;
   private T second;

    public NumericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public double sum(){
     double summa = first.doubleValue() + second.doubleValue();
     return summa;
    }


}
