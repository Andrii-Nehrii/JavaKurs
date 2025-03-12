package Lesson32.Homework.Task1;

public class Pair <T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public  T getSecond(){
        return second;
    }
    public void setFirst(T value){
       this.first = value;
    }
    public void  setSecond(T value){
        this.second = value;
    }
    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }




}
