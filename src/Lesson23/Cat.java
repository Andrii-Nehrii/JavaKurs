package Lesson23;

import javax.print.DocFlavor;

public class Cat {
  private String name;
  private int age;
  private int weight;
  protected boolean isProtected;
  boolean isDefault;



    public Cat (String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //Геттеры и сеттеры - публичные методы дающие возможность получить или изменить поля
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 30){

        }else{
        this.age = age;}
    }




    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = 1;
            System.out.println(this.weight);
            return;
        } else if (!(weight > 50)) {
          this.weight = weight;
        }
    }



  // public void setName(String name) {
    //    return;
    //}

    public void sayMeow(){
        System.out.println("Meow "+name);
    }

    public String toString(){
        String result = String.format ("Cat %s, age: %d, weight %d" , name , age , weight);
        return result;
    }

    private void testMethod(){
        System.out.println("testMethod");
    }



}
