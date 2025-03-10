package Lesson30.interfaces;

public class Presntation implements ColorPrintable {
    String title;
    String author;
    String theme;

    public Presntation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентация в цвете : author %s , title %s , theme %s" , author , title , theme);

    }

    @Override
    public void print() {
        System.out.printf("Печать чб презентации %s автора %s\n", title , author);

    }
}
