package Lesson23;

public class CatApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Catty" , 8, 5);
        cat.sayMeow();
        System.out.println(cat.toString());
     //   System.out.println(cat.age);

      //  cat.age = -1000;
       // cat.weight = 1500;
        //cat.name = null;
        //System.out.println(cat.toString());

        Cat cat2 = new Cat(null , 8, 5);

        int catAge = cat.getAge();
        System.out.println("В след году коту будет " + (catAge + 1));
        System.out.println("Имя кота: "+ cat.getName( ));

       //cat.testMethod();

        cat.setAge(15);
        System.out.println(cat.toString());
        cat.setAge(-15);
        System.out.println(cat.toString());
        cat.setWeight(-1);
        System.out.println( cat.toString());

        cat.isProtected = true;
        System.out.println("cat.isProtected "+ cat.isProtected);

        cat.isDefault = false;
        System.out.println("cat.isDefault "+cat.isDefault);



    }
}
