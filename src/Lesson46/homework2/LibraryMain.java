package Lesson46.homework2;

public class LibraryMain {
    public static void main(String[] args) {
Library library = new Library();
        System.out.println( library.findBookByTitle("Мастер и Маргарита"));
        System.out.println(library.findBookByTitle("Java"));
    }
}
