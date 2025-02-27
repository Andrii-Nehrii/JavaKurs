


 /*package Lesson22;

import java.util.Arrays;

public class MagicArray {
    int [] array;
    int cursor;
    // методы
public MagicArray(){
    this.array = new int[10];
    int cursor;
}
void  add (int value){
    if (cursor == array.length){
        expandArray();
    }


    array[cursor] = value;
    cursor++;
}
void expandArray(){
    System.out.println("Расширяем масств курсор = "+ cursor);
    int[] newArray = new int[array.length * 2];
//переписываем
    for (int i = 0; i < cursor; i++) {
        newArray[i] = array[i];
        //перекнуть ссылку


    }
        array = newArray;
}



void add (int... numbers){
//    System.out.println("Принял несколько int: "+ numbers.length);
 //   System.out.println(Arrays.toString(numbers));
    for (int i = 0; i < numbers.length; i++) {
        add(numbers[i]);

    }
}

//
public String toString(){
    if (cursor == 0) return "[]";
    String result ="[";
    for (int i = 0; i < cursor; i++) {
        result += array[i] + (i < cursor - 1 ? ", " : "]");
    }

    return result;



}
int size(){
    return  cursor;
}
int get(int index){
    if (index >= 0 && index < cursor){
    return  array[index];
    }
    return -2_147_483_647;
    //Todo Поравить обработку некоректного индкекса
    //Fixme ошибка\проблема

}
//Fixme cursor -1
int remove(int index){
    if(index >= 0 && index < cursor){
        //удаление
        int value = array[index];
        for (int i = 0; i < cursor ; i++) {
            array[i] = array[i+1];

        }
        cursor--;
        return value;
    }else{
        //индекс не валидный
        //Todo поправить возращаемое значение
       return -2_147_483_647;
    }
}



void test(){
    System.out.println(Arrays.toString(array));
}


}

/*
package Lesson22;

import java.util.Arrays;

public class MagicArray {
    int [] array;
    int cursor;
    // методы
public MagicArray(){
    this.array = new int[10];
    int cursor;
}
void  add (int value){
    if (cursor == array.length){
        expandArray();
    }


    array[cursor] = value;
    cursor++;
}
void expandArray(){

}



void add (int... numbers){
//    System.out.println("Принял несколько int: "+ numbers.length);
 //   System.out.println(Arrays.toString(numbers));
    for (int i = 0; i < numbers.length; i++) {
        add(numbers[i]);

    }
}

//
public String toString(){
    if (cursor == 0) return "[]";
    String result ="[";
    for (int i = 0; i < cursor; i++) {
        result += array[i] + (i < cursor - 1 ? ", " : "]");
    }

    return result;

}


void test(){
    System.out.println(Arrays.toString(array));
}
}


 */

