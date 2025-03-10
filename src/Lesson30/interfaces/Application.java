package Lesson30.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита " , "М.Булгаков");
        book.print();
        book.defaultMethod();

        Journal journal = new Journal("Cosmopolitan" , 154);
        journal.print();
        journal.defaultMethod();

        Printable printable = journal;
        Printable printable2 = new Book("Философия Java" , "Б. Эккель");//+ полное руководство по джава
        printable2.print();

        Printable.testStaticMrthod("Hello");
        Presntation presntation  = new Presntation("Inter" , "Noname" , "OOp");
        presntation.print();
        presntation.defaultMethod();
        presntation.colorPrint();




    }

}
