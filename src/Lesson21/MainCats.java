package Lesson21;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat();//создание обьекта класса кот

        cat.sayMeow();
        cat.run();
        cat.sleep();


        String catName = cat.name;
        System.out.println("Имя " + catName);

        System.out.println("Возраст " + cat.age);

        Cat cat1 = new Cat("Max");
        System.out.println("cat1 name: "+ cat1.name);
        System.out.println("cat1 color"+ cat1.color);

        cat.whoAmI();


        System.out.println("========================");
        Cat cat2 = new Cat("diamont" , "red");

        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white",2);
        System.out.println("name "+barsik.name);
        System.out.println("color "+barsik.color);
        System.out.println("age "+barsik.age);
        barsik.whoAmI();

        Cat catclone = barsik;

        catclone.whoAmI();
        barsik.age = 100;
        System.out.println("age = 100" );
        barsik.whoAmI();
        catclone.whoAmI();

        System.out.println("===================");

        catclone = new Cat("Kratos", "black", 66);
        catclone.whoAmI();
        barsik.whoAmI();

        // catclone = null;

    }
}
