package Lesson22;

public class Les22Main {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        //{1, 3, 5 ,4,100}
        // add(100) ,  remove(5)+

      MagicArray magic = new MagicArray();
        magic.test();

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6,7,8);
        magic.add(1,1,1,1,11);
        System.out.println("magic size =  "+magic.size());

        magic.test();
        String arrayToST= magic.toString();
        System.out.println("aToST:" + arrayToST);
        int value = magic.get(0);
        System.out.println(value);
        magic.test();
        int oldValue = magic.remove(3);
      System.out.println("3"+oldValue);
      System.out.println(magic.toString());
      magic.test();




    }
}
