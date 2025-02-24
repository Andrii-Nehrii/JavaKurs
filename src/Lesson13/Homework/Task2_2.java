package Lesson13.Homework;

public class Task2_2 {
    public static void main(String[] args) {
        String q = "Java";
        String w = "is";
        String e = "a";
        String r = "super";
        String t = "language";
        System.out.printf(q + " " + w + " " + e + " " + r + " " + t + "%n");

        String concatStr= String.join(" " , q, w, e, r, t);
        System.out.println(concatStr);

        boolean containsAge = concatStr.contains("age");
        //if (containsAge){
           // System.out.println(" contains age");
        System.out.println(containsAge);

        }






}
