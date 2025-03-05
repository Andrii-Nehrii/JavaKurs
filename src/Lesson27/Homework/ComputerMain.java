package Lesson27.Homework;

public class ComputerMain {
    public static void main(String[] args) {
        Storage storage = new Storage("Samsung" , "Evo 970" , 1000 );
        Computer computer = new Computer("Intel" , "i7-12700k" , 12 , 3.5 , "Samsung" , "X-750" , 16 , storage);
        computer.getInfo();





    }
}
