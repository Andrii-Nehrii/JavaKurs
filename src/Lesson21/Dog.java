package Lesson21;

public class Dog {
    String name;
    int weight;

    public  Dog (String name, int weight){
        this.name = name;
        this.weight = weight;

    }
    void info(){
        System.out.println("I am Dog "+ name +" And my weight: "+ weight);
    }


    void eat(){
        System.out.println("я кушаю");
        this.weight++;
    }
    void run(){
       if (weight < 3){
           System.out.println("Сорян, я слишком худая и голодная. Нада поесть!!");
           System.out.println("Мой вес сейчас: "+ weight);
           eat();
       }else {
           System.out.println("Я бегаю");
           weight -= 2;
           System.out.println("Вес после пробежки: "+ weight);
           System.out.println("================\n");
       }
    }




}
