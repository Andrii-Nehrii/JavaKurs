package Lesson25;
        //final

public class FinalDemo {
    // Для примитивных типов данных, помеченных как final
    // После инициализации (присвоения первого значения) - изменить значение переменной нельзя
    private final int capacity ;
    //Нельзя привязать новый обьект в ссылочном типе данных
    private final int [] ints = new int[5];
    private int notFinal;

    public FinalDemo (int capacity){
        this.capacity =capacity;
        // this.capacity++;

        //Нельзя переприаязать ссылку
        //this.ints = new int[2];

        //но можно изменить состояние обьекта
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }



    //Параметры метода тоже можно поиетить как final
    //внтри метода невозможно изменить значение переменной
    public void finalArguments( final int x ,final int []array){
        //нельзя изменить x
        // x ++

        // Не могу присвоить ссылку на новый обьект
        //array =  new int [2]

        array[0] = x;
        array[1] = 1000;



    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }


}
