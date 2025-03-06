package Lesson28.StaticPolymorphism.Homework;

public class People {
 protected   int  runinig = 10;
  protected int pause = 15;

   /* public People(int runinig, int pause) {
        this.runinig = runinig;
        this.pause = pause;
    }

    */

    public String run() {
       String str = "Я бегу со скоростью " + runinig + " Km/h. " + "Мне нужно " + pause + " Минут отдыха";
       return str;
   }
}
