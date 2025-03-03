package Lesson25;

public class StaticBlockDemo {
    static int counter;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    static {
        System.out.println("Static bloc run");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }
    //НЕ статический блок
    {
        System.out.println("Non statik run");
        this.title = "default";
    }


    public StaticBlockDemo(){
        if (counter == 0 ){
        this.capacity = 50;}
        System.out.println("Construktor run");

      /*  colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";

       */


    }



    public String toString(){
        return String.format("Title: %s , capacity: %d, static-counter: %d,", title , capacity , counter );


    }


}
