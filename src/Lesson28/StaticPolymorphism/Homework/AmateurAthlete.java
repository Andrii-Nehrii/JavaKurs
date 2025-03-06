package Lesson28.StaticPolymorphism.Homework;

public class AmateurAthlete extends People {
    int running = 15;
    int pause = 10;

   /* public AmateurAthlete(){
        super(15 ,10);
    }

    */

    @Override
    public String run() {
        return " я спротсмен любитель" +  super.run() ;
    }
}
