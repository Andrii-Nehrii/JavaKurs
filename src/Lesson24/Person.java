package Lesson24;

public class Person {
   private String name;
   private int age;
   private String hoby;

   public Person(String name, int age, String hoby) {
      this.name = name;
      this.age = age;
      this.hoby = hoby;
   }

   public String toString(){
      return String.format("Person %s, Age : %d, hobby : %s", name,age,hoby );

   }




   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getHoby() {
      return hoby;
   }

   public void setHoby(String hoby) {
      this.hoby = hoby;
   }
}




