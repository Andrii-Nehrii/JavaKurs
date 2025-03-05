package Lesson26.Hw;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }





    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void toStrings() {
      //  String str = "Животное: " + name;
        System.out.println("Животное: " + name);
    }

}
